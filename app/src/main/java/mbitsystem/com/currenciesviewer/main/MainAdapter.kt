package mbitsystem.com.currenciesviewer.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.subjects.PublishSubject
import kotlinx.android.synthetic.main.currency_item.view.*
import mbitsystem.com.currenciesviewer.R
import mbitsystem.com.currenciesviewer.data.model.Currency
import org.jetbrains.anko.sdk27.coroutines.onClick
import timber.log.Timber

class MainAdapter : ListAdapter<Currency, MainAdapter.CurrencyHolder>(DiffCallback()) {

    private val compositeDisposable = CompositeDisposable()

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
                    if (it.name == view.name.text) {
                          view.value.setText(it.value.toString())
                    }
                }
            }

        fun bind(position: Int) = with(view) {
            val currency = getItem(position)
            name.text = currency.name
            value.setText(currency.value.toString())
            view.onClick {
                //                with(context) {
//                    startActivity(intentFor<DetailsActivity>(KEY_INTENT_CURRENCY to currency))
//                }
//                notifyItemMoved(position, 0)

            }
        }
    }
}

class DiffCallback : DiffUtil.ItemCallback<Currency>() {
    override fun areItemsTheSame(oldItem: Currency, newItem: Currency): Boolean =
        oldItem.name == newItem.name

    override fun areContentsTheSame(oldItem: Currency, newItem: Currency): Boolean =
        oldItem.name == newItem.name
                && oldItem.value == newItem.value
}