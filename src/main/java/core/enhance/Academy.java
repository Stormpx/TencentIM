package core.enhance;

import net.sf.cglib.proxy.Enhancer;
import request.GeneralRequest;


public class Academy {

    public static GeneralRequest requestEnhance(final GeneralRequest generalRequest){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(generalRequest.getClass());
        enhancer.setCallback(new RequestMethodInterceptor());
        return (GeneralRequest) enhancer.create(new Class[]{String.class},new Object[]{generalRequest.getServiceName()});
    }
}
