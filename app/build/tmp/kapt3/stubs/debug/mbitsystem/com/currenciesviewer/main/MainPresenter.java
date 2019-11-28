package mbitsystem.com.currenciesviewer.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u0015\u001a\n \u0017*\u0004\u0018\u00010\u00160\u0016H\u0016J\b\u0010\u0018\u001a\u00020\u0014H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0019"}, d2 = {"Lmbitsystem/com/currenciesviewer/main/MainPresenter;", "Lmbitsystem/com/currenciesviewer/main/IMainPresenter;", "currencyInteractor", "Lmbitsystem/com/currenciesviewer/data/CurrencyInteractor;", "schedulerProvider", "Lmbitsystem/com/currenciesviewer/utils/SchedulerProvider;", "(Lmbitsystem/com/currenciesviewer/data/CurrencyInteractor;Lmbitsystem/com/currenciesviewer/utils/SchedulerProvider;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getCurrencyInteractor", "()Lmbitsystem/com/currenciesviewer/data/CurrencyInteractor;", "getSchedulerProvider", "()Lmbitsystem/com/currenciesviewer/utils/SchedulerProvider;", "view", "Lmbitsystem/com/currenciesviewer/main/MainView;", "getView", "()Lmbitsystem/com/currenciesviewer/main/MainView;", "setView", "(Lmbitsystem/com/currenciesviewer/main/MainView;)V", "bind", "", "displayCurrencies", "Lio/reactivex/disposables/Disposable;", "kotlin.jvm.PlatformType", "unbind", "app_debug"})
public final class MainPresenter implements mbitsystem.com.currenciesviewer.main.IMainPresenter {
    @org.jetbrains.annotations.NotNull()
    public mbitsystem.com.currenciesviewer.main.MainView view;
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    @org.jetbrains.annotations.NotNull()
    private final mbitsystem.com.currenciesviewer.data.CurrencyInteractor currencyInteractor = null;
    @org.jetbrains.annotations.NotNull()
    private final mbitsystem.com.currenciesviewer.utils.SchedulerProvider schedulerProvider = null;
    
    @org.jetbrains.annotations.NotNull()
    public final mbitsystem.com.currenciesviewer.main.MainView getView() {
        return null;
    }
    
    public final void setView(@org.jetbrains.annotations.NotNull()
    mbitsystem.com.currenciesviewer.main.MainView p0) {
    }
    
    @java.lang.Override()
    public void bind(@org.jetbrains.annotations.NotNull()
    mbitsystem.com.currenciesviewer.main.MainView view) {
    }
    
    @java.lang.Override()
    public void unbind() {
    }
    
    @java.lang.Override()
    public io.reactivex.disposables.Disposable displayCurrencies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final mbitsystem.com.currenciesviewer.data.CurrencyInteractor getCurrencyInteractor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final mbitsystem.com.currenciesviewer.utils.SchedulerProvider getSchedulerProvider() {
        return null;
    }
    
    @javax.inject.Inject()
    public MainPresenter(@org.jetbrains.annotations.NotNull()
    mbitsystem.com.currenciesviewer.data.CurrencyInteractor currencyInteractor, @org.jetbrains.annotations.NotNull()
    mbitsystem.com.currenciesviewer.utils.SchedulerProvider schedulerProvider) {
        super();
    }
}