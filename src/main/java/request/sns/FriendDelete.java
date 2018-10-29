package request.sns;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import util.DeleteType;
import util.VariableUtil;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@Command("friend_delete")
public class FriendDelete extends SnsModel {
    @JSONField(name = "To_Account")
    private List<String> toAccount;
    @JSONField(name = "DeleteType")
    private String deleteType;
    public FriendDelete(String serviceName) {
        super(serviceName);
    }

    @Override
    protected String check() {
        if (VariableUtil.isEmpty(toAccount)){
            return "To_Account";
        }
        if (VariableUtil.isEmpty(deleteType)){
            return "DeleteType";
        }
        if (!deleteType.equals(DeleteType.DeleteTypeBoth)&&!deleteType.equals(DeleteType.DeleteTypeSingle)){
            return getNonSupport("DeleteType",deleteType);
        }
        return null;
    }

    public List<String> getToAccount() {
        return toAccount;
    }

    public FriendDelete setToAccount(List<String> toAccount) {
        this.toAccount = toAccount;return this;
    }
    public FriendDelete setFromAccount(String fromAccount) {
        super.fromAccount = fromAccount;
        return this;
    }
    public FriendDelete setToAccount(String... toAccount) {
        if (this.toAccount==null){
            this.toAccount=new LinkedList<>();
        }
        Collections.addAll(this.toAccount,toAccount);
        return this;
    }

    public String getDeleteType() {
        return deleteType;
    }

    public FriendDelete setDeleteType(String deleteType) {
        this.deleteType = deleteType;return this;
    }
}
