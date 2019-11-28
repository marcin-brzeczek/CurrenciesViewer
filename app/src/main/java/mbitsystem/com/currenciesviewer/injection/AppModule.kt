package mbitsystem.com.currenciesviewer.injection

import dagger.Module
import dagger.Provides
import mbitsystem.com.currenciesviewer.InitApp
import mbitsystem.com.currenciesviewer.data.CurrencyInteractor
import mbitsystem.com.currenciesviewer.main.IMainPresenter
import mbitsystem.com.currenciesviewer.main.MainPresenter
import mbitsystem.com.currenciesviewer.utils.AppSchedulerProvider
import mbitsystem.com.currenciesviewer.utils.SchedulerProvider
import javax.inject.Singleton

@Module
class AppModule(val application: InitApp) {

    @Provides
    @Singleton
    fun providesApplication(): InitApp {
        return application
    }

    @Singleton
    @Provides
    fun providesMainPresenter(currencyInteractor: CurrencyInteractor, schedulerProvider: AppSchedulerProvider): IMainPresenter =
        MainPresenter(currencyInteractor, schedulerProvider)

    @Provides
    @Singleton
    fun provideSchedulerProvider(): SchedulerProvider = AppSchedulerProvider()

}