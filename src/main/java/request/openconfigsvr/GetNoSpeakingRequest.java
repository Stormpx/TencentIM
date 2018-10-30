package request.openconfigsvr;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import request.GeneralRequest;
import response.GetNoSpeakingResponse;
import util.VariableUtil;

@Command("getnospeaking")
public class GetNoSpeakingRequest extends GeneralRequest<GetNoSpeakingResponse> {
    @JSONField(name = "Get_Account")
    private String getAccount;

    public GetNoSpeakingRequest(String serviceName) {
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

    public GetNoSpeakingRequest setGetAccount(String getAccount) {
        this.getAccount = getAccount;return this;
    }
}
