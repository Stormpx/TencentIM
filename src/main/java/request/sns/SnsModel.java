package request.sns;

import com.alibaba.fastjson.annotation.JSONField;
import request.GeneralModel;
import util.VariableUtil;

public abstract class SnsModel extends GeneralModel {
    @JSONField(name = "From_Account")
    protected String fromAccount;
    public SnsModel(String serviceName) {
        super(serviceName);
    }

    @Override
    public String checkParam() {
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
