package mbitsystem.com.currenciesviewer.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\n"}, d2 = {"Lmbitsystem/com/currenciesviewer/data/CurrencyInteractor;", "Lmbitsystem/com/currenciesviewer/data/Interactor;", "currenciesApi", "Lmbitsystem/com/currenciesviewer/data/network/CurrenciesApi;", "(Lmbitsystem/com/currenciesviewer/data/network/CurrenciesApi;)V", "getCurrenciesApi", "()Lmbitsystem/com/currenciesviewer/data/network/CurrenciesApi;", "getCurrencies", "Lio/reactivex/Observable;", "Lmbitsystem/com/currenciesviewer/state/CurrencyState;", "app_debug"})
public final class CurrencyInteractor implements mbitsystem.com.currenciesviewer.data.Interactor {
    @org.jetbrains.annotations.NotNull()
    private final mbitsystem.com.currenciesviewer.data.network.CurrenciesApi currenciesApi = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<mbitsystem.com.currenciesviewer.state.CurrencyState> getCurrencies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final mbitsystem.com.currenciesviewer.data.network.CurrenciesApi getCurrenciesApi() {
        return null;
    }
    
    @javax.inject.Inject()
    public CurrencyInteractor(@org.jetbrains.annotations.NotNull()
    mbitsystem.com.currenciesviewer.data.network.CurrenciesApi currenciesApi) {
        super();
    }
}