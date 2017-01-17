package android.marshi.wave.usecase;

import android.marshi.wave.repository.FeedRepository;
import rx.Observable;
import rx.schedulers.Schedulers;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by a13178 on 2017/01/17.
 */
@Singleton
public class FeedUseCase extends UseCase<Void, Observable<String>> {

    @Inject
    FeedRepository feedRepository;

    @Inject
    public FeedUseCase() {}

    @Override
    public Observable<String> start(Void aVoid) {
        return feedRepository.feed()
          .observeOn(Schedulers.computation())
          .map(s -> s);
    }


}
