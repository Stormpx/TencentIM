package response.result;

import com.alibaba.fastjson.JSONObject;

import java.util.concurrent.TimeUnit;

public class SyncCoverResult<T> implements CoverResult<T> {
    private JSONObject jsonObject;
    private Class<T> tClass;

    @Override
    public T get() {
        return null;
    }

    @Override
    public T get(long timeout, TimeUnit unit) {
        return null;
    }

    @Override
    public boolean isDone() {
        return false;
    }
}
