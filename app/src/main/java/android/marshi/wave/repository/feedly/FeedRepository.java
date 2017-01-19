package android.marshi.wave.repository.feedly;

import rx.Observable;
import rx.schedulers.Schedulers;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by a13178 on 2017/01/17.
 */
@Singleton
public class FeedRepository {

    @Inject
    FeedlyClient feedlyClient;

    @Inject
    public FeedRepository () {}

    public Observable<FeedDto> feed() {
        return feedlyClient.getFeed("").subscribeOn(Schedulers.newThread());
    }

}
