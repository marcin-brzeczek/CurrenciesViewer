package mbitsystem.com.currenciesviewer.injection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003\u00a8\u0006\u0004"}, d2 = {"Lmbitsystem/com/currenciesviewer/injection/AppComponent;", "Ldagger/android/AndroidInjector;", "Lmbitsystem/com/currenciesviewer/InitApp;", "Builder", "app_debug"})
@dagger.Component(modules = {dagger.android.AndroidInjectionModule.class, dagger.android.support.AndroidSupportInjectionModule.class, mbitsystem.com.currenciesviewer.injection.ActivityInjectorsModule.class, mbitsystem.com.currenciesviewer.injection.AppModule.class, mbitsystem.com.currenciesviewer.injection.ApiModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent extends dagger.android.AndroidInjector<mbitsystem.com.currenciesviewer.InitApp> {
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u000bH&\u00a8\u0006\f"}, d2 = {"Lmbitsystem/com/currenciesviewer/injection/AppComponent$Builder;", "Ldagger/android/AndroidInjector$Builder;", "Lmbitsystem/com/currenciesviewer/InitApp;", "()V", "build", "Lmbitsystem/com/currenciesviewer/injection/AppComponent;", "setApiModule", "", "module", "Lmbitsystem/com/currenciesviewer/injection/ApiModule;", "setAppModule", "Lmbitsystem/com/currenciesviewer/injection/AppModule;", "app_debug"})
    @dagger.Component.Builder()
    public static abstract class Builder extends dagger.android.AndroidInjector.Builder<mbitsystem.com.currenciesviewer.InitApp> {
        
        public abstract void setAppModule(@org.jetbrains.annotations.NotNull()
        mbitsystem.com.currenciesviewer.injection.AppModule module);
        
        public abstract void setApiModule(@org.jetbrains.annotations.NotNull()
        mbitsystem.com.currenciesviewer.injection.ApiModule module);
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public abstract mbitsystem.com.currenciesviewer.injection.AppComponent build();
        
        public Builder() {
            super();
        }
    }
}