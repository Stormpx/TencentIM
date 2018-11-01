package request.sns;

import com.alibaba.fastjson.annotation.JSONField;
import request.GeneralRequest;
import response.GeneralResponse;
import util.VariableUtil;

public abstract class SnsRequest<T extends GeneralResponse> extends GeneralRequest<T> {
    @JSONField(name = "From_Account")
    protected String fromAccount;

    @Override
    protected String checkParam() {
        if (VariableUtil.isEmpty(fromAccount)){
            return "From_Account";
        }
        return check();
    }

    protected abstract String check();

    public String getFromAccount() {
        return fromAccount;
    }


}
