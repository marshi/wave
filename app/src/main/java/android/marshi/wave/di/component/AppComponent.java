package android.marshi.wave.di.component;

import android.marshi.wave.MainActivity;
import android.marshi.wave.di.module.AppModule;
import android.marshi.wave.di.module.PresenterModule;

import dagger.Component;

/**
 * Created by a13178 on 2017/01/16.
 */
@Component(dependencies = {AppModule.class, PresenterModule.class})
public interface AppComponent {

    void inject(MainActivity activity);

}
