package request.sns;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import util.CheckType;
import util.DeleteType;
import util.VariableUtil;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@Command("friend_check")
public class FriendCheck extends SnsModel {
    @JSONField(name = "To_Account")
    private List<String> toAccount;
    @JSONField(name = "CheckType")
    private String checkType;
    public FriendCheck(String serviceName) {
        super(serviceName);
    }

    @Override
    protected String check() {
        if (VariableUtil.isEmpty(toAccount)){
            return "To_Account";
        }
        if (VariableUtil.isEmpty(checkType)){
            return "CheckType";
        }
        if (!checkType.equals(CheckType.CheckResultTypeBoth)&&!checkType.equals(CheckType.CheckResultTypeSingal)){
            return getNonSupport("CheckType",checkType);
        }
        return null;
    }
    public List<String> getToAccount() {
        return toAccount;
    }

    public FriendCheck setToAccount(List<String> toAccount) {
        this.toAccount = toAccount;return this;
    }

    public FriendCheck setToAccount(String... toAccount) {
        if (this.toAccount==null){
            this.toAccount=new LinkedList<>();
        }
        Collections.addAll(this.toAccount,toAccount);
        return this;
    }
    public FriendCheck setFromAccount(String fromAccount) {
        super.fromAccount = fromAccount;
        return this;
    }
    public String getCheckType() {
        return checkType;
    }

    public FriendCheck setCheckType(String checkType) {
        this.checkType = checkType;return this;
    }
}
