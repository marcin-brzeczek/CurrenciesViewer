package mbitsystem.com.currenciesviewer.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&\u00a8\u0006\t"}, d2 = {"Lmbitsystem/com/currenciesviewer/main/IMainPresenter;", "", "bind", "", "view", "Lmbitsystem/com/currenciesviewer/main/MainView;", "displayCurrencies", "Lio/reactivex/disposables/Disposable;", "unbind", "app_debug"})
public abstract interface IMainPresenter {
    
    public abstract void bind(@org.jetbrains.annotations.NotNull()
    mbitsystem.com.currenciesviewer.main.MainView view);
    
    public abstract void unbind();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.disposables.Disposable displayCurrencies();
}