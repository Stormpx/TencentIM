package core.notice;

import com.alibaba.fastjson.JSONObject;
import io.netty.handler.codec.http.HttpHeaders;
import org.asynchttpclient.*;
import response.AsyncCoverResult;
import response.CoverResult;
import response.GeneralResponse;

import java.nio.charset.Charset;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AsyncHttpClient implements HttpClient{
    private final static DefaultAsyncHttpClient asyncHttpClient=new DefaultAsyncHttpClient();


    @Override
    public CoverResult request(String url, JSONObject param){
        System.out.println(param.toJSONString());
        BoundRequestBuilder boundRequestBuilder = asyncHttpClient.preparePost(url);
        boundRequestBuilder = requestBuilder(boundRequestBuilder, param);
        ListenableFuture<GeneralResponse> future = boundRequestBuilder.execute(new AsyncHandler<GeneralResponse>() {
            private StringBuffer sb=new StringBuffer();
            @Override
            public State onStatusReceived(HttpResponseStatus responseStatus) throws Exception {
                return State.CONTINUE;
            }

            @Override
            public State onHeadersReceived(HttpHeaders headers) throws Exception {

                return State.CONTINUE;
            }

            @Override
            public State onBodyPartReceived(HttpResponseBodyPart bodyPart) throws Exception {
                sb.append(new String(bodyPart.getBodyPartBytes(), Charset.forName("UTF-8")));
                return State.CONTINUE;
            }

            @Override
            public GeneralResponse onCompleted() throws Exception {
                GeneralResponse generalResponse=new GeneralResponse();
                JSONObject json = JSONObject.parseObject(sb.toString());
                generalResponse.setActionStatus((String) json.remove("ActionStatus"));
                generalResponse.setErrorCode((Integer) json.remove("ErrorCode"));
                generalResponse.setErrorInfo((String) json.remove("ErrorInfo"));
                generalResponse.setErrorDisplay((String) json.remove("ErrorDisplay"));
                generalResponse.setResponseResult(json);
                return generalResponse;
            }

            @Override
            public void onThrowable(Throwable t) {
                t.printStackTrace();
            }
        });
        return new AsyncCoverResult(future);
    }
    public BoundRequestBuilder requestBuilder(BoundRequestBuilder requestBuilder,JSONObject jsonObject){
        requestBuilder.setBody(jsonObject.toJSONString());
        return requestBuilder;
    }

}
