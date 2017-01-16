package android.marshi.wave.repository;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by a13178 on 2017/01/17.
 */
@Singleton
public class FeedRepository {

    @Inject
    public FeedRepository () {}

    public String feed() {
        return "hi";
    }

}
