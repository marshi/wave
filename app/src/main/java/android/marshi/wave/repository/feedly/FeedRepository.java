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
        return feedlyClient.getFeed("feed/http://www.publickey1.jp/atom.xml").subscribeOn(Schedulers.newThread());
    }

}
