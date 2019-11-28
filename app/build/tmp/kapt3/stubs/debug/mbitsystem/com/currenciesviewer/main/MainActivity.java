package mbitsystem.com.currenciesviewer.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\u0012\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\b\u0010\u0010\u001a\u00020\fH\u0014J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\b\u0010\u001b\u001a\u00020\fH\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u001c"}, d2 = {"Lmbitsystem/com/currenciesviewer/main/MainActivity;", "Lmbitsystem/com/currenciesviewer/base/BaseActivity;", "Lmbitsystem/com/currenciesviewer/main/MainView;", "()V", "presenter", "Lmbitsystem/com/currenciesviewer/main/MainPresenter;", "getPresenter", "()Lmbitsystem/com/currenciesviewer/main/MainPresenter;", "setPresenter", "(Lmbitsystem/com/currenciesviewer/main/MainPresenter;)V", "getFilesIntent", "Lio/reactivex/Observable;", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onStop", "render", "state", "Lmbitsystem/com/currenciesviewer/state/CurrencyState;", "renderDataState", "dataState", "Lmbitsystem/com/currenciesviewer/state/CurrencyState$DataState;", "renderErrorState", "Landroid/widget/Toast;", "error", "", "renderLoadingState", "app_debug"})
public final class MainActivity extends mbitsystem.com.currenciesviewer.base.BaseActivity implements mbitsystem.com.currenciesviewer.main.MainView {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public mbitsystem.com.currenciesviewer.main.MainPresenter presenter;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final mbitsystem.com.currenciesviewer.main.MainPresenter getPresenter() {
        return null;
    }
    
    public final void setPresenter(@org.jetbrains.annotations.NotNull()
    mbitsystem.com.currenciesviewer.main.MainPresenter p0) {
    }
    
    @java.lang.Override()
    public void render(@org.jetbrains.annotations.NotNull()
    mbitsystem.com.currenciesviewer.state.CurrencyState state) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<kotlin.Unit> getFilesIntent() {
        return null;
    }
    
    private final void renderLoadingState() {
    }
    
    private final void renderDataState(mbitsystem.com.currenciesviewer.state.CurrencyState.DataState dataState) {
    }
    
    private final android.widget.Toast renderErrorState(java.lang.String error) {
        return null;
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    public MainActivity() {
        super();
    }
}