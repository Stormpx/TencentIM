package core.enhance;

import net.sf.cglib.proxy.Enhancer;
import request.GeneralModel;


public class Academy {

    public static GeneralModel requestEnhance(final GeneralModel generalModel){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(generalModel.getClass());
        enhancer.setCallback(new RequestMethodInterceptor());
        return (GeneralModel) enhancer.create(new Class[]{String.class},new Object[]{generalModel.getServiceName()});
    }
}
