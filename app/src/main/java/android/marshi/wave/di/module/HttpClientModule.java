package android.marshi.wave.di.module;

import android.marshi.wave.repository.feedly.FeedlyClient;
import com.facebook.stetho.okhttp3.StethoInterceptor;
import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.Request;
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
		OkHttpClient httpClient = builder.addInterceptor(chain -> {
			Request original = chain.request();
			Request request = original.newBuilder().header("Authorization", "1OrArSEnq5NrDLj-GnVuLQYJQZQzth5fIgc37DDRJ3GOzAWJW-gwo9vt-jp6aFFu3wNm2S62jONvBXe_F99WNU2FwFvT4oqVSQuPj7WwpCUMDufKa45Yl8AjPUPuJVd8gf__ZHJcNJUBqELdFFNEDTErnXGeCGWuOi7SHHgxYUBdfsu3eXlNHfeO425aLGyaEddNqUJOJlBjOxqXWvB1-aJNFyDWQ:feedlydev").build();
			return chain.proceed(request);
		})
			.addNetworkInterceptor(new StethoInterceptor())
			.build();
		Retrofit retrofit = new Retrofit.Builder()
			.baseUrl("http://cloud.feedly.com")
			.addConverterFactory(GsonConverterFactory.create())
			.addCallAdapterFactory(RxJavaCallAdapterFactory.create())
			.client(httpClient)
			.build();
		return retrofit.create(FeedlyClient.class);
	}

}
