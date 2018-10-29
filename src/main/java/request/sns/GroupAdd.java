package request.sns;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import util.VariableUtil;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@Command("group_add")
public class GroupAdd extends SnsModel {
    @JSONField(name = "GroupName")
    private List<String> groupName;
    @JSONField(name = "To_Account")
    private List<String> toAccount;

    public GroupAdd(String serviceName) {
        super(serviceName);
    }

    @Override
    protected String check() {
        if (VariableUtil.isEmpty(groupName)) {
            return "GroupName";
        }
        return null;
    }

    public List<String> getToAccount() {
        return toAccount;
    }

    public GroupAdd setToAccount(List<String> toAccount) {
        this.toAccount = toAccount;
        return this;
    }

    public GroupAdd setToAccount(String... toAccount) {
        if (this.toAccount == null) {
            this.toAccount = new LinkedList<>();
        }
        Collections.addAll(this.toAccount, toAccount);
        return this;
    }

    public GroupAdd setGroupName(List<String> groupName) {
        this.groupName = groupName;
        return this;
    }

    public GroupAdd setGroupName(String... groupName) {
        if (this.groupName == null) {
            this.groupName = new LinkedList<>();
        }
        Collections.addAll(this.groupName, groupName);
        return this;
    }

    public List<String> getGroupName() {
        return groupName;
    }

    public GroupAdd setFromAccount(String fromAccount) {
        super.fromAccount = fromAccount;
        return this;
    }
}
