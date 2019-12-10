package mbitsystem.com.currenciesviewer.data.network

import io.reactivex.Observable
import mbitsystem.com.currenciesviewer.data.model.CurrenciesResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface CurrenciesApi {

    @GET("/latest")
    fun getCurrenciesForEUR(@Query("base") base: String = "EUR"): Observable<CurrenciesResponse>
}