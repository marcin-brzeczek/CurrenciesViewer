package mbitsystem.com.currenciesviewer.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.currency_item.view.*
import mbitsystem.com.currenciesviewer.R
import mbitsystem.com.currenciesviewer.data.model.Currency
import org.jetbrains.anko.sdk27.coroutines.onClick

class MainAdapter : ListAdapter<Currency, MainAdapter.CurrencyHolder>(DiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CurrencyHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.currency_item, parent, false)
        return CurrencyHolder(view)
    }

    override fun onBindViewHolder(holder: CurrencyHolder, position: Int) =
        holder.bind(getItem(position))

    inner class CurrencyHolder(val view: View) : RecyclerView.ViewHolder(view) {
        fun bind(currency: Currency) = with(view) {
            title.text = currency.name
            body.text = currency.value.toString()
            view.onClick {
//                with(context) {
//                    startActivity(intentFor<DetailsActivity>(KEY_INTENT_CURRENCY to currency))
//                }
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