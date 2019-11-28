package mbitsystem.com.currenciesviewer.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016\u00a8\u0006\u0006"}, d2 = {"Lmbitsystem/com/currenciesviewer/utils/AppSchedulerProvider;", "Lmbitsystem/com/currenciesviewer/utils/SchedulerProvider;", "()V", "ioScheduler", "Lio/reactivex/Scheduler;", "uiScheduler", "app_debug"})
public final class AppSchedulerProvider implements mbitsystem.com.currenciesviewer.utils.SchedulerProvider {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Scheduler ioScheduler() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Scheduler uiScheduler() {
        return null;
    }
    
    public AppSchedulerProvider() {
        super();
    }
}