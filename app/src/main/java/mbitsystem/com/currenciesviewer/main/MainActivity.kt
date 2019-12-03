package mbitsystem.com.currenciesviewer.main

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import io.reactivex.Observable
import kotlinx.android.synthetic.main.activity_main.*
import mbitsystem.com.currenciesviewer.R
import mbitsystem.com.currenciesviewer.base.BaseActivity
import mbitsystem.com.currenciesviewer.state.CurrencyState
import org.jetbrains.anko.longToast
import timber.log.Timber
import javax.inject.Inject

class MainActivity : BaseActivity(), MainView {

    @Inject
    lateinit var presenter: MainPresenter

    private var listSubmited = true

    override fun render(state: CurrencyState) {
        Timber.d("State: ${state.javaClass.simpleName}")
        when (state) {
            is CurrencyState.LoadingState -> renderLoadingState()
            is CurrencyState.DataState -> renderDataState(state)
            is CurrencyState.ErrorState -> renderErrorState(state.error)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recycler_view.adapter = MainAdapter(recycler_view)
        recycler_view.layoutManager = LinearLayoutManager(this)
    }

    override fun onResume() {
        super.onResume()
        presenter.bind(this)
    }

    override fun getFilesIntent(): Observable<Unit> = Observable.just(Unit)

    private fun renderLoadingState() {
        recycler_view.isEnabled = false
        progress_bar.visibility = View.VISIBLE
    }

    private fun renderDataState(dataState: CurrencyState.DataState) {
        progress_bar.visibility = View.GONE
        recycler_view.apply {
            isEnabled = true

            if (listSubmited) {
                (adapter as MainAdapter).addItems(dataState.data)
                listSubmited = false
            }
            (adapter as MainAdapter).intentFilterAscendingPublisher.onNext(dataState.data!!)
        }
    }

    private fun renderErrorState(error: String?) = error?.let {
        longToast(getString(R.string.error_load_data) + it)
        Timber.e("Error loading data: $it")
    }

    override fun onPause() {
        super.onPause()
        presenter.unbind()
    }
}