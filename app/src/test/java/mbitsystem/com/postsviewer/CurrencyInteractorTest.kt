package mbitsystem.com.postsviewer

import io.reactivex.schedulers.TestScheduler
import mbitsystem.com.currenciesviewer.data.CurrencyInteractor
import mbitsystem.com.currenciesviewer.data.model.Currency
import mbitsystem.com.currenciesviewer.data.network.CurrenciesApi
import mbitsystem.com.currenciesviewer.main.MainPresenter
import mbitsystem.com.currenciesviewer.main.MainView
import mbitsystem.com.currenciesviewer.state.CurrencyState
import mbitsystem.com.postsviewer.testutil.TestSchedulerProvider
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
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

//        //Given
//        val posts = dummyCurrencies
//
//        //When
//        Mockito.`when`(currenciesApi.getCurrenciesByBase()).thenReturn(Observable.just(posts))
//        val result = underTest.getPosts()
//
//        val testObserver = TestObserver<CurrencyState>()
//        result.subscribe(testObserver)
//        testObserver.assertComplete()
//        testObserver.assertNoErrors()
//        testObserver.assertValueCount(1)
//        val fileState = testObserver.values()[0] as CurrencyState.DataState
//        val resultList = fileState.data
//
//        // Then
//        assertThat(resultList.size, `is`(4))
//        assertThat(resultList[0].title, `is`("urlPath"))
//        assertThat(resultList[1].title, `is`("PosterPath2"))
    }

    @Test
    fun `verify view when get post`() {

//        //Given
//        val posts = dummyCurrencies
//
//        //When
//        Mockito.`when`(currenciesApi.getCurrenciesByBase()).thenReturn(Observable.just(posts))
//        testGetPosts()
//        testScheduler.triggerActions()
//
//        // Then
//        verify(mainView).render(CurrencyState.LoadingState)
//        verify(mainView).render(CurrencyState.DataState(posts))
    }

    @Test
    fun `verify view when error get post`() {

        //Given
//        val testError ="error"
//        val observable : Observable<List<Post>> = Observable.create{
//            emitter ->  emitter.onError(Exception(testError))
//        }
//
//        //When
//        Mockito.`when`(currenciesApi.getCurrenciesByBase()).thenReturn(observable)
//        testGetPosts()
//        testScheduler.triggerActions()
//
//        // Then
//        verify(mainView).render(CurrencyState.LoadingState)
//        verify(mainView).render(CurrencyState.ErrorState(testError))
    }

    private fun testGetCurrencies() {
        underTest.getCurrencies()
            .startWith(CurrencyState.LoadingState)
            .subscribeOn(testScheduler)
            .observeOn(testScheduler)
            .subscribe { mainView.render(it) }
    }

    private val dummyCurrencies: ArrayList<Currency>
        get() {
            val dummyCurrencies = ArrayList<Currency>()
            dummyCurrencies.add(Currency("AUD", 1.6236))
            dummyCurrencies.add(Currency("BGN", 1.9645))
            dummyCurrencies.add(Currency("BRL", 4.8132))
            dummyCurrencies.add(Currency("CAD", 1.5407))
            return dummyCurrencies
        }
}