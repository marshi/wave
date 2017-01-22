package android.marshi.wave.usecase;

import android.marshi.wave.domain.FeedCard;
import android.marshi.wave.repository.feedly.FeedRepository;
import rx.Observable;
import rx.schedulers.Schedulers;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by a13178 on 2017/01/17.
 */
@Singleton
public class FeedUseCase extends UseCase<Void, Observable<FeedCard>> {

    @Inject
    FeedRepository feedRepository;

    @Inject
    public FeedUseCase() {}

    @Override
    public Observable<FeedCard> start(Void aVoid) {
        return feedRepository.feed()
            .observeOn(Schedulers.computation())
            .map(s -> {
                return new FeedCard(s.getTitle(), s.getDescription(), s.getVisualUrl());
            });
    }

}
