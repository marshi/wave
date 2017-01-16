package android.marshi.wave.di.component;

import android.marshi.wave.activity.MainActivity;
import android.marshi.wave.di.module.AppModule;
import android.marshi.wave.di.module.PresenterModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by a13178 on 2017/01/16.
 */
@Component(dependencies = {AppModule.class, PresenterModule.class})
@Singleton
public interface AppComponent {

    void inject(MainActivity activity);

}
