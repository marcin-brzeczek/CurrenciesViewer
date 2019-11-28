package mbitsystem.com.currenciesviewer.data

import io.reactivex.Observable
import mbitsystem.com.currenciesviewer.state.CurrencyState

interface Interactor {
    fun getCurrencies(): Observable<CurrencyState>
}