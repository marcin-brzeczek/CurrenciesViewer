package mbitsystem.com.currenciesviewer.data.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0007H\'\u00a8\u0006\b"}, d2 = {"Lmbitsystem/com/currenciesviewer/data/network/CurrenciesApi;", "", "getCurrenciesByBase", "Lio/reactivex/Observable;", "Lretrofit2/Response;", "Lmbitsystem/com/currenciesviewer/data/model/CurrenciesResponse;", "base", "", "app_debug"})
public abstract interface CurrenciesApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/latest")
    public abstract io.reactivex.Observable<retrofit2.Response<mbitsystem.com.currenciesviewer.data.model.CurrenciesResponse>> getCurrenciesByBase(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "base")
    java.lang.String base);
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}