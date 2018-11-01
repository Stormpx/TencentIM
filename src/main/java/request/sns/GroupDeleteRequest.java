package request.sns;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import response.GroupDeleteResponse;
import util.VariableUtil;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@Command("group_delete")
public class GroupDeleteRequest extends SnsRequest<GroupDeleteResponse> {
    @JSONField(name = "GroupName")
    private List<String> groupName;

    @Override
    protected String check() {
        if (VariableUtil.isEmpty(groupName)) {
            return "GroupName";
        }
        return null;
    }
    public GroupDeleteRequest setGroupName(List<String> groupName) {
        this.groupName = groupName;
        return this;
    }

    public GroupDeleteRequest setGroupName(String... groupName) {
        if (this.groupName == null) {
            this.groupName = new LinkedList<>();
        }
        Collections.addAll(this.groupName, groupName);
        return this;
    }

    public List<String> getGroupName() {
        return groupName;
    }

    public GroupDeleteRequest setFromAccount(String fromAccount) {
        super.fromAccount = fromAccount;
        return this;
    }
}
