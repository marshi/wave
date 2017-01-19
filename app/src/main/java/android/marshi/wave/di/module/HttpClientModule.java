package android.marshi.wave.di.module;

import android.marshi.wave.repository.feedly.FeedlyClient;
import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Copyright: marshi
 */
@Module
public class HttpClientModule {

	@Provides
	public FeedlyClient provideFeedlyClient() {
		OkHttpClient.Builder builder = new OkHttpClient.Builder();
		OkHttpClient httpClient = builder.build();
		Retrofit retrofit = new Retrofit.Builder()
			.baseUrl("http://cloud.feedly.com")
			.addConverterFactory(GsonConverterFactory.create())
			.addCallAdapterFactory(RxJavaCallAdapterFactory.create())
			.client(httpClient)
			.build();
		return retrofit.create(FeedlyClient.class);
	}

}
