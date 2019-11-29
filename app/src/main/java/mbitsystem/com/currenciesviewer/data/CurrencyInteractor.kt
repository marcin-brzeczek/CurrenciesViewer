package mbitsystem.com.currenciesviewer.data

import io.reactivex.Observable
import mbitsystem.com.currenciesviewer.data.model.Currency
import mbitsystem.com.currenciesviewer.data.network.CurrenciesApi
import mbitsystem.com.currenciesviewer.state.CurrencyState
import javax.inject.Inject

class CurrencyInteractor @Inject constructor(
    val currenciesApi: CurrenciesApi
) : Interactor {

    override fun getCurrencies(): Observable<CurrencyState> = currenciesApi.getCurrenciesByBase()
        .map<CurrencyState> { CurrencyState.DataState(it.body()?.rates?.currencies)}
        .onErrorReturn { CurrencyState.ErrorState(it.message) }
}