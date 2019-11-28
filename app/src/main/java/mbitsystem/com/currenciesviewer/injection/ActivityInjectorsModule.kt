package mbitsystem.com.currenciesviewer.injection

import dagger.Module
import dagger.android.ContributesAndroidInjector
import mbitsystem.com.currenciesviewer.main.MainActivity

@Module
abstract class ActivityInjectorsModule {
    @ContributesAndroidInjector abstract fun provideMainActivityInjector(): MainActivity
}