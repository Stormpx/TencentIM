package request.sns;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import response.BlackListCheckResponse;
import util.CheckType;
import util.VariableUtil;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@Command("black_list_check")
public class BlackListCheckRequest extends SnsRequest<BlackListCheckResponse> {
    @JSONField(name = "To_Account")
    private List<String> toAccount;
    @JSONField(name = "CheckType")
    private String blackCheckType;
    public BlackListCheckRequest(String serviceName) {
        super(serviceName);
    }

    @Override
    protected String check() {
        if (VariableUtil.isEmpty(toAccount)){
            return "To_Account";
        }
        if (VariableUtil.isEmpty(blackCheckType)){
            return "CheckType";
        }
        if (!blackCheckType.equals(CheckType.BlackCheckResultTypeBoth)&&!blackCheckType.equals(CheckType.BlackCheckResultTypeSingal)){
            return getNonSupport("CheckType", blackCheckType);
        }
        return null;
    }
    public List<String> getToAccount() {
        return toAccount;
    }

    public BlackListCheckRequest setToAccount(List<String> toAccount) {
        this.toAccount = toAccount;return this;
    }

    public BlackListCheckRequest setToAccount(String... toAccount) {
        if (this.toAccount==null){
            this.toAccount=new LinkedList<>();
        }
        Collections.addAll(this.toAccount,toAccount);
        return this;
    }
    public BlackListCheckRequest setFromAccount(String fromAccount) {
        super.fromAccount = fromAccount;
        return this;
    }
    public String getBlackCheckType() {
        return blackCheckType;
    }

    public BlackListCheckRequest setBlackCheckType(String blackCheckType) {
        this.blackCheckType = blackCheckType;return this;
    }
}
