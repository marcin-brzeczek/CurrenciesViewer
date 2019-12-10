package mbitsystem.com.postsviewer

import io.reactivex.Observable
import io.reactivex.observers.TestObserver
import io.reactivex.schedulers.TestScheduler
import mbitsystem.com.currenciesviewer.data.CurrencyInteractor
import mbitsystem.com.currenciesviewer.data.model.CurrenciesResponse
import mbitsystem.com.currenciesviewer.data.model.Currency
import mbitsystem.com.currenciesviewer.data.model.Rates
import mbitsystem.com.currenciesviewer.data.network.CurrenciesApi
import mbitsystem.com.currenciesviewer.main.MainPresenter
import mbitsystem.com.currenciesviewer.main.MainView
import mbitsystem.com.currenciesviewer.state.CurrencyState
import mbitsystem.com.postsviewer.testutil.TestSchedulerProvider
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.verify
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class CurrencyInteractorTest : BaseTest() {

    @Rule
    @JvmField
    var testSchedulerRule = RxImmediateSchedulerRule()

    @Mock
    lateinit var currenciesApi: CurrenciesApi

    @Mock
    lateinit var mainView: MainView

    lateinit var underTest: CurrencyInteractor

    lateinit var mainPresenter: MainPresenter

    lateinit var testScheduler: TestScheduler

    @Before
    fun setUp() {
        testScheduler = TestScheduler()
        val testSchedulerProvider = TestSchedulerProvider(testScheduler)
        underTest = CurrencyInteractor(currenciesApi)
        mainPresenter = MainPresenter(underTest, testSchedulerProvider)
        mainPresenter.view = mainView
    }

    @Test
    fun `test observer when get posts`() {

        //Given
        val curriences = dummyCurrencies

        //When
        Mockito.`when`(currenciesApi.getCurrenciesForEUR()).thenReturn(Observable.just(curriences))
        val result = underTest.getCurrencies()


        val testObserver = TestObserver<CurrencyState>()
        result.subscribe(testObserver)
        testObserver.assertComplete()
        testObserver.assertNoErrors()
        testObserver.assertValueCount(1)
        val fileState = testObserver.values()[0] as CurrencyState.DataState
        val resultList = fileState.data

        // Then
        assertThat(resultList?.size, `is`(4))
        assertThat(resultList?.get(0)?.name, `is`("AUD"))
        assertThat(resultList?.get(1)?.value, `is`(1.9645))
    }

    @Test
    fun `verify view when get curriencies`() {

        //Given
        val currenciesResponse = dummyCurrencies

        //When
        Mockito.`when`(currenciesApi.getCurrenciesForEUR()).thenReturn(Observable.just(currenciesResponse))
        testGetCurrencies()
        testScheduler.triggerActions()

        // Then
        verify(mainView).render(CurrencyState.LoadingState)
        verify(mainView).render(CurrencyState.DataState(currenciesResponse.rates.currencies))
    }

    @Test
    fun `verify view when error get post`() {

        //Given
        val testError ="error"
        val observable : Observable<CurrenciesResponse> = Observable.create{
            emitter ->  emitter.onError(Exception(testError))
        }

        //When
        Mockito.`when`(currenciesApi.getCurrenciesForEUR()).thenReturn(observable)
        testGetCurrencies()
        testScheduler.triggerActions()

        // Then
        verify(mainView).render(CurrencyState.LoadingState)
        verify(mainView).render(CurrencyState.ErrorState(testError))
    }

    private fun testGetCurrencies() {
        underTest.getCurrencies()
            .startWith(CurrencyState.LoadingState)
            .subscribeOn(testScheduler)
            .observeOn(testScheduler)
            .subscribe { mainView.render(it) }
    }

    private val dummyCurrencies: CurrenciesResponse
        get() {
            val dummyCurrencies = CurrenciesResponse(
                base = "EUR",
                date = "2018-09-06",
                rates = Rates(
                    listOf(
                        Currency("AUD", 1.6236),
                        Currency("BGN", 1.9645),
                        Currency("BRL", 4.8132),
                        Currency("CAD", 1.5407)
                    )
                )
            )
            return dummyCurrencies
        }
}