package core.enhance;

import annotation.Command;
import annotation.ServiceName;
import com.alibaba.fastjson.JSONObject;
import core.TIMConfig;
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

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        Object result = methodProxy.invokeSuper(obj, args);
        if (method.getName().endsWith("Prepare")){
            String serviceName=getServiceName(obj);
            if (result instanceof GeneralRequest){
                ((GeneralRequest) result).setServiceName(serviceName);
            }
        }
        return result;
    }

    protected String getServiceName(Object obj){
        return obj.getClass().getSuperclass().getAnnotation(ServiceName.class).value();
    }
}
