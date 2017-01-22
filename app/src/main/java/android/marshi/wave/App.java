package android.marshi.wave;

import android.app.Application;
import android.marshi.wave.di.component.AppComponent;
import android.marshi.wave.di.component.DaggerAppComponent;
import android.marshi.wave.di.module.AppModule;
import android.marshi.wave.di.module.HttpClientModule;
import android.marshi.wave.repository.feedly.FeedlyClient;
import com.facebook.stetho.Stetho;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

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
          .httpClientModule(new HttpClientModule())
          .build();
        Stetho.initialize(
            Stetho.newInitializerBuilder(this)
                .enableDumpapp(Stetho.defaultDumperPluginsProvider(this))
                .enableWebKitInspector(Stetho.defaultInspectorModulesProvider(this))
                .build()
        );
    }

    private void initializeHttpClient() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        OkHttpClient httpClient = builder.build();
        Retrofit retrofit = new Retrofit.Builder()
          .baseUrl("http://cloud.feedly.com")
          .addConverterFactory(GsonConverterFactory.create())
          .client(httpClient)
          .build();
        FeedlyClient feedlyClient = retrofit.create(FeedlyClient.class);
    }

    public AppComponent getApplicationComponent() {
        return appComponent;
    }

}
