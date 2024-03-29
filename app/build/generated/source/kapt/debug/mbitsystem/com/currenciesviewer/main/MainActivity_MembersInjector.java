// Generated by Dagger (https://google.github.io/dagger).
package mbitsystem.com.currenciesviewer.main;

import dagger.MembersInjector;
import javax.inject.Provider;

public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<MainPresenter> presenterProvider;

  public MainActivity_MembersInjector(Provider<MainPresenter> presenterProvider) {
    this.presenterProvider = presenterProvider;
  }

  public static MembersInjector<MainActivity> create(Provider<MainPresenter> presenterProvider) {
    return new MainActivity_MembersInjector(presenterProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    injectPresenter(instance, presenterProvider.get());
  }

  public static void injectPresenter(MainActivity instance, MainPresenter presenter) {
    instance.presenter = presenter;
  }
}
