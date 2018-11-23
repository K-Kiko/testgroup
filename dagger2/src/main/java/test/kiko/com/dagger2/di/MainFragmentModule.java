package test.kiko.com.dagger2.di;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import test.kiko.com.dagger2.MainFragment;

@Module
public abstract class MainFragmentModule {

    @ContributesAndroidInjector
    abstract MainFragment contributeRepoFragment();

}
