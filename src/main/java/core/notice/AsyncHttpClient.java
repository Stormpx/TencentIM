package core.notice;

import com.alibaba.fastjson.JSONObject;
import io.netty.handler.codec.http.HttpHeaders;
import org.asynchttpclient.*;
import response.result.AsyncCoverResult;
import response.result.CoverResult;
import response.GeneralResponse;

import java.nio.charset.Charset;

public class AsyncHttpClient implements HttpClient{
    private final static DefaultAsyncHttpClient asyncHttpClient=new DefaultAsyncHttpClient();


    @Override
    public CoverResult request(String url, JSONObject param,Class responseClass){
        System.out.println(param.toJSONString());
        BoundRequestBuilder boundRequestBuilder = asyncHttpClient.preparePost(url);
        boundRequestBuilder = requestBuilder(boundRequestBuilder, param);
        ListenableFuture<JSONObject> future = boundRequestBuilder.execute(new AsyncHandler<JSONObject>() {
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
            public JSONObject onCompleted() throws Exception {
                JSONObject json = JSONObject.parseObject(sb.toString());
                /*GeneralResponse generalResponse=new GeneralResponse();
                generalResponse.setActionStatus((String) json.remove("ActionStatus"));
                generalResponse.setErrorCode((Integer) json.remove("ErrorCode"));
                generalResponse.setErrorInfo((String) json.remove("ErrorInfo"));
                generalResponse.setErrorDisplay((String) json.remove("ErrorDisplay"));
                generalResponse.setResponseResult(json);*/
                return json;
            }

            @Override
            public void onThrowable(Throwable t) {
                t.printStackTrace();
            }
        });
        return new AsyncCoverResult(future,responseClass);
    }
    public BoundRequestBuilder requestBuilder(BoundRequestBuilder requestBuilder,JSONObject jsonObject){
        requestBuilder.setBody(jsonObject.toJSONString());
        return requestBuilder;
    }

}
