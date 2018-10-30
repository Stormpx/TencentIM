package response.result;

import java.util.concurrent.TimeUnit;

public interface CoverResult<T> {
    T get();

    T get(long timeout, TimeUnit unit);

    boolean isDone();
}
