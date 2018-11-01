package request;

import annotation.Command;
import com.alibaba.fastjson.JSONObject;
import core.TIMConfig;
import core.notice.AsyncHttpClient;
import core.notice.HttpClient;
import core.notice.SyncHttpClient;
import exception.ParamNonSupportException;
import exception.RequiredParamException;
import response.result.CoverResult;
import response.GeneralResponse;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public abstract class GeneralRequest<T extends GeneralResponse> {
    private static  HttpClient httpClient;

    private String serviceName;

    static {
        if(httpClient==null) {
            if (TIMConfig.isAsync()) {
                httpClient = new AsyncHttpClient();
            } else {
                httpClient = new SyncHttpClient();
            }
        }
    }

    public CoverResult<T> execute(){
        String param = checkParam();
        if (param!=null){
            if (param.contains("@")){
                String[] strings = param.split("@");
                String s="command "+strings[0]+" : param"+strings[1]+" 不能为"+strings[2];
                throw new ParamNonSupportException(s);
            }
            throw new RequiredParamException(getCommand()+"~~  "+param);
        }
        String service=serviceName();
        String command=getCommand();
        JSONObject jsonObject = JSONObject.parseObject(JSONObject.toJSONString(this));
        String url= TIMConfig.buildRequestUrl(service,command);
        CoverResult coverResult = httpClient.request(url, jsonObject,getResponseClass());
        return coverResult;
    }

    private Class getResponseClass(){
        Class clazz = this.getClass();
        // 2获取当前类的带有泛型的父类类型
        ParameterizedType type = (ParameterizedType) clazz.getGenericSuperclass();
        // 3返回实际参数类型(泛型可以写多个)
        Type[] types = type.getActualTypeArguments();
        // 4 获取第一个参数(泛型的具体类)
        clazz = (Class) types[0];
        return clazz;
    }


    protected abstract String checkParam();

    protected String serviceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    protected String getCommand(){
        return this.getClass().getAnnotation(Command.class).value();
    }

    protected String getNonSupport(String param,String value){
        return getCommand()+"@"+param+"@"+value;
    }
}
