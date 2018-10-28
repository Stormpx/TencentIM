package response;

import org.asynchttpclient.ListenableFuture;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class AsyncCoverResult implements CoverResult {
    private ListenableFuture<GeneralResponse> listenableFuture;

    public AsyncCoverResult(ListenableFuture<GeneralResponse> listenableFuture) {
        this.listenableFuture = listenableFuture;
    }

    @Override
    public GeneralResponse get() {

        try {
            return listenableFuture.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        return null;
    }
    @Override
    public GeneralResponse get(long timeout, TimeUnit unit) {

        try {
            return listenableFuture.get(timeout,unit);
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
