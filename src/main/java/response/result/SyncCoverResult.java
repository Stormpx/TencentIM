package response.result;

import com.alibaba.fastjson.JSONObject;

import java.util.concurrent.TimeUnit;

public class SyncCoverResult<T> implements CoverResult<T> {
    private JSONObject jsonObject;
    private Class<T> tClass;

    public SyncCoverResult(JSONObject jsonObject, Class<T> tClass) {
        this.jsonObject = jsonObject;
        this.tClass = tClass;
    }

    @Override
    public T get() {

        return jsonObject.toJavaObject(tClass);
    }

    @Override
    public T get(long timeout, TimeUnit unit) {
        return get();
    }

    @Override
    public boolean isDone() {
        return true;
    }
}
