package core.enhance;

import net.sf.cglib.proxy.Enhancer;
import request.GeneralRequest;


public class Academy {
    private static RequestMethodInterceptor requestMethodInterceptor=new RequestMethodInterceptor();
    public static <T> T requestEnhance(Class<T> tClass){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(tClass);
        enhancer.setCallback(requestMethodInterceptor);
        return (T) enhancer.create();
    }
}
