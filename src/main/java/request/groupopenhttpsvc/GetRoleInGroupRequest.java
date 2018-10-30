package request.groupopenhttpsvc;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import request.GeneralRequest;
import response.GetRoleInGroupResponse;
import util.VariableUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Command("get_role_in_group")
public class GetRoleInGroupRequest extends GeneralRequest<GetRoleInGroupResponse> {
    @JSONField(name = "GroupId")
    private String groupId;
    @JSONField(name = "User_Account")
    private List<String> userAccount;
    public GetRoleInGroupRequest(String serviceName) {
        super(serviceName);
    }

    @Override
    public String checkParam() {
        if (VariableUtil.isEmpty(groupId)){
            return "GroupId";
        }
        if (VariableUtil.isEmpty(userAccount)){
            return "User_Account";
        }
        return null;
    }

    public GetRoleInGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;return this;
    }

    public GetRoleInGroupRequest setUserAccount(List<String> userAccount) {
        this.userAccount = userAccount;return this;
    }

    public GetRoleInGroupRequest setUserAccount(String... userAccount) {
        if (this.userAccount==null){
            this.userAccount=new ArrayList<>();
        }
        Collections.addAll(this.userAccount,userAccount);
        return this;
    }

    public String getGroupId() {
        return groupId;
    }

    public List<String> getUserAccount() {
        return userAccount;
    }
}
