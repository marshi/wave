package android.marshi.wave.di.component;

import android.marshi.wave.activity.FeedTimelineActivity;
import android.marshi.wave.activity.MainActivity;
import android.marshi.wave.di.module.AppModule;
import android.marshi.wave.di.module.HttpClientModule;
import android.marshi.wave.di.module.PresenterModule;
import android.marshi.wave.di.module.RepositoryModule;
import android.marshi.wave.di.module.UseCaseModule;
import dagger.Component;

import javax.inject.Singleton;

/**
 * Created by a13178 on 2017/01/16.
 */
@Component(dependencies = {AppModule.class, PresenterModule.class, UseCaseModule.class, RepositoryModule.class, HttpClientModule.class})
@Singleton
public interface AppComponent {

    void inject(MainActivity activity);

    void inject(FeedTimelineActivity activity);

}
