package android.marshi.wave.di.module;

import android.content.Context;
import android.marshi.wave.App;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by a13178 on 2017/01/16.
 */
@Module
public class AppModule {

    private final App app;

    public AppModule(App app) {
        this.app = app;
    }

    @Provides
    @Singleton
    public Context provideApplicationContext() {
        return this.app.getApplicationContext();
    }

}
