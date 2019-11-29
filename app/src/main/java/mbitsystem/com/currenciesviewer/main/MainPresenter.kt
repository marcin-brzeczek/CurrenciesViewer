package mbitsystem.com.currenciesviewer.main

import io.reactivex.disposables.CompositeDisposable
import mbitsystem.com.currenciesviewer.data.CurrencyInteractor
import mbitsystem.com.currenciesviewer.state.CurrencyState
import mbitsystem.com.currenciesviewer.utils.SchedulerProvider
import timber.log.Timber
import java.util.concurrent.TimeUnit
import javax.inject.Inject

class MainPresenter @Inject constructor(
    val currencyInteractor: CurrencyInteractor,
    val schedulerProvider: SchedulerProvider
) : IMainPresenter {

    lateinit var view: MainView
    private val compositeDisposable = CompositeDisposable()

    override fun bind(view: MainView) {
        this.view = view
        compositeDisposable.add(displayCurrencies())
    }

    override fun unbind() {
        if (!compositeDisposable.isDisposed) {
            compositeDisposable.clear()
        }
    }

    override fun displayCurrencies() = view.getFilesIntent()
        .doOnNext { Timber.d("Intent: Display Curriences") }
        .delay(1, TimeUnit.SECONDS)
        .repeat()
        .flatMap<CurrencyState> { currencyInteractor.getCurrencies() }
        .startWith(CurrencyState.LoadingState)
        .subscribeOn(schedulerProvider.ioScheduler())
        .observeOn(schedulerProvider.uiScheduler())
        .subscribe { view.render(it) }
}