package request.openconfigsvr;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import request.GeneralModel;
import util.VariableUtil;

@Command("getnospeaking")
public class GetNoSpeaking extends GeneralModel {
    @JSONField(name = "Get_Account")
    private String getAccount;

    public GetNoSpeaking(String serviceName) {
        super(serviceName);
    }

    @Override
    public String checkParam() {
        if (VariableUtil.isEmpty(getAccount)){
            return "Get_Account";
        }
        return null;
    }

    public String getGetAccount() {
        return getAccount;
    }

    public GetNoSpeaking setGetAccount(String getAccount) {
        this.getAccount = getAccount;return this;
    }
}
