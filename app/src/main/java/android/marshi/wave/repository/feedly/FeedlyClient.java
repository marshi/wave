package android.marshi.wave.repository.feedly;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Copyright: marshi
 */
public interface FeedlyClient {

	@GET(value = "/v3/feeds/{feedId}")
	Observable<FeedDto> getFeed(@Path("feedId") String feedId);

}
