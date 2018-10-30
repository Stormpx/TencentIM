package response.result;

import com.alibaba.fastjson.JSONObject;
import org.asynchttpclient.ListenableFuture;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class AsyncCoverResult<T> implements CoverResult<T> {
    private ListenableFuture<JSONObject> listenableFuture;
    private Class<T> tClass;
    public AsyncCoverResult(ListenableFuture<JSONObject> listenableFuture,Class<T> tClass) {
        this.listenableFuture = listenableFuture;
        this.tClass=tClass;
    }

    @Override
    public T get() {

        try {
            JSONObject jsonObject = listenableFuture.get();
            return jsonObject.toJavaObject(tClass);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        return null;
    }
    @Override
    public T get(long timeout, TimeUnit unit) {

        try {
            JSONObject jsonObject = listenableFuture.get(timeout,unit);
            return jsonObject.toJavaObject(tClass);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            e.printStackTrace();
        }
        return null;
    }
    @Override
    public boolean isDone(){
        return listenableFuture.isDone();
    }
}
