package mbitsystem.com.currenciesviewer.injection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H\'\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\'\u00a8\u0006\b"}, d2 = {"Lmbitsystem/com/currenciesviewer/injection/ActivityInjectorsModule;", "", "()V", "provideDetailsActivityInjector", "error/NonExistentClass", "()Lerror/NonExistentClass;", "provideMainActivityInjector", "Lmbitsystem/com/currenciesviewer/main/MainActivity;", "app_debug"})
@dagger.Module()
public abstract class ActivityInjectorsModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract mbitsystem.com.currenciesviewer.main.MainActivity provideMainActivityInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract error.NonExistentClass provideDetailsActivityInjector();
    
    public ActivityInjectorsModule() {
        super();
    }
}