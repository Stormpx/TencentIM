package request.groupopenhttpsvc;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import request.GeneralModel;
@Command("change_group_owner")
public class ChangeGroupOwner extends GeneralModel {
    @JSONField(name = "GroupId")
    private String groupId;
    @JSONField(name = "NewOwner_Account")
    private String newOwnerAccount;
    public ChangeGroupOwner(String serviceName) {
        super(serviceName);
    }

    @Override
    public String checkParam() {
        return null;
    }

    public String getGroupId() {
        return groupId;
    }

    public ChangeGroupOwner setGroupId(String groupId) {
        this.groupId = groupId;return this;
    }

    public String getNewOwnerAccount() {
        return newOwnerAccount;
    }

    public ChangeGroupOwner setNewOwnerAccount(String newOwnerAccount) {
        this.newOwnerAccount = newOwnerAccount;return this;
    }
}
