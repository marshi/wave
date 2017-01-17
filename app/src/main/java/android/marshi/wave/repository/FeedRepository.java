package android.marshi.wave.repository;

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
    public FeedRepository () {}

    public Observable<String> feed() {
        return
          Observable.just("hi")
            .subscribeOn(Schedulers.io());
    }

}
