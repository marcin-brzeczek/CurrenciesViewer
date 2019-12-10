package mbitsystem.com.currenciesviewer

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.HasActivityInjector
import mbitsystem.com.currenciesviewer.injection.ApiModule
import mbitsystem.com.currenciesviewer.injection.AppModule
import mbitsystem.com.currenciesviewer.injection.DaggerAppComponent
import timber.log.Timber

const val apiUrl: String = "https://revolut.duckdns.org"

class InitApp : DaggerApplication(), HasActivityInjector {
    private val _applicationInjector by lazy {
        DaggerAppComponent.builder().let {
            it.seedInstance(this)
            it.setAppModule(AppModule(this))
            it.setApiModule(ApiModule( apiUrl))
            it.build()
        }
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> = _applicationInjector

    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}
