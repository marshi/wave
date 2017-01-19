package android.marshi.wave.presenter;

import android.marshi.wave.FeedRecyclerViewAdapter;
import android.marshi.wave.usecase.FeedUseCase;
import rx.android.schedulers.AndroidSchedulers;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by a13178 on 2017/01/16.
 */
@Singleton
public class FeedPresenter {

  @Inject
  FeedUseCase feedUseCase;

  @Inject
  public FeedPresenter(){}

  public void feedText(FeedRecyclerViewAdapter adapter) {
    feedUseCase.start(null)
      .observeOn(AndroidSchedulers.mainThread())
      .subscribe(adapter::add);
  }

}
