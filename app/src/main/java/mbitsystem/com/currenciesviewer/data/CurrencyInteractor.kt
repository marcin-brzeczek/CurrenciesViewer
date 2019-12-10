package mbitsystem.com.currenciesviewer.data

import io.reactivex.Observable
import mbitsystem.com.currenciesviewer.data.network.CurrenciesApi
import mbitsystem.com.currenciesviewer.state.CurrencyState
import javax.inject.Inject

class CurrencyInteractor @Inject constructor(
    val currenciesApi: CurrenciesApi
) : Interactor {

    override fun getCurrencies(): Observable<CurrencyState> = currenciesApi.getCurrenciesForEUR()
        .map<CurrencyState> { CurrencyState.DataState(it.rates.currencies)}
        .onErrorReturn { CurrencyState.ErrorState(it.message) }
}