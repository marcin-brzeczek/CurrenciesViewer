package mbitsystem.com.currenciesviewer.injection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\u0003H\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lmbitsystem/com/currenciesviewer/injection/AppModule;", "", "application", "Lmbitsystem/com/currenciesviewer/InitApp;", "(Lmbitsystem/com/currenciesviewer/InitApp;)V", "getApplication", "()Lmbitsystem/com/currenciesviewer/InitApp;", "provideSchedulerProvider", "Lmbitsystem/com/currenciesviewer/utils/SchedulerProvider;", "providesApplication", "providesMainPresenter", "Lmbitsystem/com/currenciesviewer/main/IMainPresenter;", "currencyInteractor", "Lmbitsystem/com/currenciesviewer/data/CurrencyInteractor;", "schedulerProvider", "Lmbitsystem/com/currenciesviewer/utils/AppSchedulerProvider;", "app_debug"})
@dagger.Module()
public final class AppModule {
    @org.jetbrains.annotations.NotNull()
    private final mbitsystem.com.currenciesviewer.InitApp application = null;
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final mbitsystem.com.currenciesviewer.InitApp providesApplication() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final mbitsystem.com.currenciesviewer.main.IMainPresenter providesMainPresenter(@org.jetbrains.annotations.NotNull()
    mbitsystem.com.currenciesviewer.data.CurrencyInteractor currencyInteractor, @org.jetbrains.annotations.NotNull()
    mbitsystem.com.currenciesviewer.utils.AppSchedulerProvider schedulerProvider) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final mbitsystem.com.currenciesviewer.utils.SchedulerProvider provideSchedulerProvider() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final mbitsystem.com.currenciesviewer.InitApp getApplication() {
        return null;
    }
    
    public AppModule(@org.jetbrains.annotations.NotNull()
    mbitsystem.com.currenciesviewer.InitApp application) {
        super();
    }
}