package request.sns;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import util.VariableUtil;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@Command("group_delete")
public class GroupDelete extends SnsModel {
    @JSONField(name = "GroupName")
    private List<String> groupName;
    public GroupDelete(String serviceName) {
        super(serviceName);
    }

    @Override
    protected String check() {
        if (VariableUtil.isEmpty(groupName)) {
            return "GroupName";
        }
        return null;
    }
    public GroupDelete setGroupName(List<String> groupName) {
        this.groupName = groupName;
        return this;
    }

    public GroupDelete setGroupName(String... groupName) {
        if (this.groupName == null) {
            this.groupName = new LinkedList<>();
        }
        Collections.addAll(this.groupName, groupName);
        return this;
    }

    public List<String> getGroupName() {
        return groupName;
    }

    public GroupDelete setFromAccount(String fromAccount) {
        super.fromAccount = fromAccount;
        return this;
    }
}
