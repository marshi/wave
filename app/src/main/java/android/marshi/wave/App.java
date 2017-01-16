package android.marshi.wave;

import android.app.Application;
import android.marshi.wave.di.component.AppComponent;
import android.marshi.wave.di.component.DaggerAppComponent;
import android.marshi.wave.di.module.AppModule;

/**
 * Created by a13178 on 2017/01/16.
 */
public class App extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        initializeInjector();
    }

    private void initializeInjector() {
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public AppComponent getApplicationComponent() {
        return appComponent;
    }

}
