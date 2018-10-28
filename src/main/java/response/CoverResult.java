package response;

import java.util.concurrent.TimeUnit;

public interface CoverResult {
    GeneralResponse get();

    GeneralResponse get(long timeout, TimeUnit unit);

    boolean isDone();
}
