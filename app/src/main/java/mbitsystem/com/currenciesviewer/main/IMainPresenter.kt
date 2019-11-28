package mbitsystem.com.currenciesviewer.main

import io.reactivex.disposables.Disposable

interface IMainPresenter {
    fun bind(view: MainView)
    fun unbind()
    fun displayCurrencies(): Disposable
}