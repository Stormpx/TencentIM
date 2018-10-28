package response;

import java.util.concurrent.TimeUnit;

public class SyncCoverResult implements CoverResult {
    @Override
    public GeneralResponse get() {
        return null;
    }

    @Override
    public GeneralResponse get(long timeout, TimeUnit unit) {
        return null;
    }

    @Override
    public boolean isDone() {
        return false;
    }
}
