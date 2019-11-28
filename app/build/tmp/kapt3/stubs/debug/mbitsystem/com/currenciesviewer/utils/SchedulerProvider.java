package mbitsystem.com.currenciesviewer.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lmbitsystem/com/currenciesviewer/utils/SchedulerProvider;", "", "ioScheduler", "Lio/reactivex/Scheduler;", "uiScheduler", "app_debug"})
public abstract interface SchedulerProvider {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Scheduler uiScheduler();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Scheduler ioScheduler();
}