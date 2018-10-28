package core.enhance;

import annotation.Command;
import com.alibaba.fastjson.JSONObject;
import config.TencentImConfig;
import core.notice.AsyncHttpClient;
import core.notice.HttpClient;
import core.notice.SyncHttpClient;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.asynchttpclient.ListenableFuture;
import request.GeneralModel;
import response.CoverResult;
import response.GeneralResponse;

import java.lang.reflect.Method;

public class RequestMethodInterceptor implements MethodInterceptor {
    public RequestMethodInterceptor() {
        if (TencentImConfig.isAsync()){
            httpClient=new AsyncHttpClient();
        }else{
            httpClient=new SyncHttpClient();
        }
    }

    private static HttpClient httpClient;
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        Object result = methodProxy.invokeSuper(obj, args);
        if (method.getName().equals("execute")){
            GeneralModel gm= (GeneralModel) obj;
            String service=gm.getServiceName();
            String command=obj.getClass().getSuperclass().getAnnotation(Command.class).value();
            JSONObject jsonObject = JSONObject.parseObject(JSONObject.toJSONString(obj));
            jsonObject.remove("serviceName");
            String url= TencentImConfig.buildRequestUrl(service,command);
            CoverResult coverResult = httpClient.request(url, jsonObject);
            return coverResult;
        }
        return result;
    }
}
