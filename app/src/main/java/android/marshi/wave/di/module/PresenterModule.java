package android.marshi.wave.di.module;

import android.marshi.wave.FeedPresenter;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by a13178 on 2017/01/16.
 */
@Module
public class PresenterModule {

    @Provides
    @Singleton
    public FeedPresenter provideFeedPresenter() {
        return new FeedPresenter();
    }

}
