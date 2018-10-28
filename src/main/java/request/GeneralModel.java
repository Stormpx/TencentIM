package request;

import annotation.Command;
import exception.RequiredParamException;
import response.CoverResult;
import response.GeneralResponse;

public abstract class GeneralModel {
    private String ServiceName;

    public GeneralModel(String serviceName) {
        ServiceName = serviceName;
    }

    public CoverResult execute(){
        String param = checkParam();
        if (param!=null){
            throw new RequiredParamException(this.getClass().getSuperclass().getAnnotation(Command.class).value()+"~~  "+param);
        }

        return null;
    }

    public abstract String checkParam();

    public String getServiceName() {
        return ServiceName;
    }
}
