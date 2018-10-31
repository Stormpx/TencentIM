package core.enhance;

import annotation.Command;
import com.alibaba.fastjson.JSONObject;
import config.TencentImConfig;
import core.notice.AsyncHttpClient;
import core.notice.HttpClient;
import core.notice.SyncHttpClient;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import request.GeneralRequest;
import response.result.CoverResult;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class RequestMethodInterceptor implements MethodInterceptor {
    public RequestMethodInterceptor() {
        if (httpClient==null&&TencentImConfig.isAsync()){
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
            GeneralRequest gr= (GeneralRequest) obj;
            String service=gr.getServiceName();
            String command=obj.getClass().getSuperclass().getAnnotation(Command.class).value();
            JSONObject jsonObject = JSONObject.parseObject(JSONObject.toJSONString(obj));
            jsonObject.remove("serviceName");
            //jsonObject.remove("command");
            String url= TencentImConfig.buildRequestUrl(service,command);

            CoverResult coverResult = httpClient.request(url, jsonObject,getResponseClass(obj));
            return coverResult;
        }
        return result;
    }

    private Class getResponseClass(Object obj){
        Class clazz = obj.getClass().getSuperclass();
        // 2获取当前类的带有泛型的父类类型
        ParameterizedType type = (ParameterizedType) clazz.getGenericSuperclass();
        // 3返回实际参数类型(泛型可以写多个)
        Type[] types = type.getActualTypeArguments();
        // 4 获取第一个参数(泛型的具体类)
        clazz = (Class) types[0];
        return clazz;
    }
}
