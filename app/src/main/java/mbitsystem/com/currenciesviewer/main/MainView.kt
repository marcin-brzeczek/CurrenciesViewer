package mbitsystem.com.currenciesviewer.main

import io.reactivex.Observable
import mbitsystem.com.currenciesviewer.state.CurrencyState

interface MainView {
    fun render(state: CurrencyState)
    fun getFilesIntent(): Observable<Unit>
}
