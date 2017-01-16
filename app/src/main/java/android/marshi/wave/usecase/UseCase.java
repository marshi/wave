package android.marshi.wave.usecase;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by a13178 on 2017/01/17.
 */

public abstract class UseCase<P, R> {

    public abstract R start(P p);

}
