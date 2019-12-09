package mbitsystem.com.currenciesviewer.main

import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.subjects.PublishSubject
import kotlinx.android.synthetic.main.currency_item.view.*
import mbitsystem.com.currenciesviewer.R
import mbitsystem.com.currenciesviewer.data.model.Currency
import timber.log.Timber

class MainAdapter(private val recyclerView: RecyclerView? = null) :
    RecyclerView.Adapter<MainAdapter.CurrencyHolder>() {

    private val compositeDisposable = CompositeDisposable()

    private val items: MutableList<Currency> = mutableListOf()

    private var euroValue = 1.0

    override fun getItemCount() = items.size

    fun addItems(data: List<Currency>?) {
        data?.let {
            items.clear()
            items.addAll(data)
            notifyDataSetChanged()
        }
    }

    val intentFilterAscendingPublisher = PublishSubject.create<List<Currency>>()

    fun getFilesAscendingIntent(): Observable<List<Currency>> = intentFilterAscendingPublisher

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CurrencyHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.currency_item, parent, false)
        val viewHolder = CurrencyHolder(view)

        compositeDisposable.add(viewHolder.displayCurrencies())
        return viewHolder
    }

    override fun onBindViewHolder(holder: CurrencyHolder, position: Int) =
        holder.bind(position)

    inner class CurrencyHolder(val view: View) : RecyclerView.ViewHolder(view) {

        fun displayCurrencies() = getFilesAscendingIntent()
            .doOnNext { Timber.d("Intent: Display Curriences") }
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe {
                it.forEach {
                    if (it.name == view.name.text && !view.value.hasFocus()) {
                        val calculatedValue = it.value * euroValue
                        view.value.setText(calculatedValue.toString())
                    }
                }
            }

        fun bind(position: Int) = with(view) {
            val currency = items[position]
            name.text = currency.name
            value.setText(currency.value.toString())
            value.addTextChangedListener(geValueTextWatcher(currency.name))
            view.setOnClickListener(moveToTop())
        }

        private fun geValueTextWatcher(currencyName: String) = object : TextWatcher {
            override fun afterTextChanged(s: Editable?) = Unit
            override fun beforeTextChanged(
                s: CharSequence?,
                start: Int,
                count: Int,
                after: Int
            ) = Unit

            override fun onTextChanged(
                s: CharSequence?,
                start: Int,
                count: Int,
                after: Int
            ) {
                val currency = items.find { it.name == currencyName }
                currency?.let {
                    val valueForOneEur = it.value
                    //todo handle parse exception (empty string, dot, etc...)
                    val updatedValue = s?.toString()?.toDouble()
                    updatedValue?.let {
                        euroValue = (updatedValue / valueForOneEur)
                    }
                }
            }
        }

        private fun moveToTop(): (View) -> Unit = {
            layoutPosition.takeIf { it > 0 }?.also { currentPosition ->
                items.removeAt(currentPosition).also {
                    items.add(0, it)
                }
                notifyItemMoved(currentPosition, 0)
                recyclerView?.scrollToPosition(0)
                view.value.requestFocus()
            }
        }
    }
}