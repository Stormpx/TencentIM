package request;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import exception.ParamNonSupportException;
import exception.RequiredParamException;
import response.CoverResult;
import response.GeneralResponse;
/**
 * 这里的方法都需要在cglib的代理下才能正常使用
 * execute方法只判断合法参数默认返回空 交给代理对象处理*/
public abstract class GeneralModel {
    private String ServiceName;

    public GeneralModel(String serviceName) {
        ServiceName = serviceName;
    }

    public CoverResult execute(){
        String param = checkParam();
        if (param!=null){
            if (param.contains("@")){
                String[] strings = param.split("@");
                String s="command "+strings[0]+" : param"+strings[1]+" 不能为"+strings[2];
                throw new ParamNonSupportException(s);
            }
            throw new RequiredParamException(getCommand()+"~~  "+param);
        }


        return null;
    }

    public abstract String checkParam();

    public String getServiceName() {
        return ServiceName;
    }

    public String getCommand(){
        return this.getClass().getSuperclass().getAnnotation(Command.class).value();
    }
    public String getJsonField(String name){
        try {
            return this.getClass().getSuperclass().getField(name).getAnnotation(JSONField.class).name();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        return null;
    }
    public String getNonSupport(String param,String value){
        return getCommand()+"@"+param+"@"+value;
    }
}
