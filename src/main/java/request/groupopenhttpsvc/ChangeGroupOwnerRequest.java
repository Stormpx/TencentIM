package request.groupopenhttpsvc;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import request.GeneralRequest;
import response.GeneralResponse;

@Command("change_group_owner")
public class ChangeGroupOwnerRequest extends GeneralRequest<GeneralResponse> {
    @JSONField(name = "GroupId")
    private String groupId;
    @JSONField(name = "NewOwner_Account")
    private String newOwnerAccount;
    public ChangeGroupOwnerRequest(String serviceName) {
        super(serviceName);
    }

    @Override
    public String checkParam() {
        return null;
    }

    public String getGroupId() {
        return groupId;
    }

    public ChangeGroupOwnerRequest setGroupId(String groupId) {
        this.groupId = groupId;return this;
    }

    public String getNewOwnerAccount() {
        return newOwnerAccount;
    }

    public ChangeGroupOwnerRequest setNewOwnerAccount(String newOwnerAccount) {
        this.newOwnerAccount = newOwnerAccount;return this;
    }
}
