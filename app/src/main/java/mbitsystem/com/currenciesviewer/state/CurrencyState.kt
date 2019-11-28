package mbitsystem.com.currenciesviewer.state

import mbitsystem.com.currenciesviewer.data.model.Currency

sealed class CurrencyState {
    object LoadingState : CurrencyState()
    data class DataState(val data: List<Currency>?) : CurrencyState()
    data class ErrorState(val error: String?) : CurrencyState()
}