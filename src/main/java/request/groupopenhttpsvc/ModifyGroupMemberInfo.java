package request.groupopenhttpsvc;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import model.AppDefinedData;
import model.Member;
import request.GeneralModel;
import util.VariableUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Command("modify_group_member_info")
public class ModifyGroupMemberInfo extends GeneralModel {
    @JSONField(name = "GroupId")
    private String groupId;
    @JSONField(name = "Member_Account")
    private String memberAccount;
    @JSONField(name = "Role")
    private String role;
    @JSONField(name = "MsgFlag")
    private String msgFlag;
    @JSONField(name = "AppMemberDefinedData")
    private List<AppDefinedData> appDefinedData;
    public ModifyGroupMemberInfo(String serviceName) {
        super(serviceName);
    }

    @Override
    public String checkParam() {
        if (VariableUtil.isEmpty(groupId)){
            return "GroupId";
        }
        if (VariableUtil.isEmpty(memberAccount)){
            return "Member_Account";
        }
        return null;
    }
    public String getMemberAccount() {
        return memberAccount;
    }

    public ModifyGroupMemberInfo setMemberAccount(String memberAccount) {
        this.memberAccount = memberAccount;return this;
    }

    public String getRole() {
        return role;
    }

    public ModifyGroupMemberInfo setRole(String role) {
        this.role = role;return this;
    }

    public List<AppDefinedData> getAppDefinedData() {
        return appDefinedData;
    }

    public ModifyGroupMemberInfo setAppDefinedData(List<AppDefinedData> appDefinedData) {
        this.appDefinedData = appDefinedData;return this;
    }
    public ModifyGroupMemberInfo setAppDefinedData(AppDefinedData... appDefinedData) {
        if (this.appDefinedData==null){
            this.appDefinedData=new ArrayList<>();
        }
        Collections.addAll(this.appDefinedData,appDefinedData);return this;
    }

    public String getGroupId() {
        return groupId;
    }

    public ModifyGroupMemberInfo setGroupId(String groupId) {
        this.groupId = groupId;return this;
    }

    public String getMsgFlag() {
        return msgFlag;
    }

    public ModifyGroupMemberInfo setMsgFlag(String msgFlag) {
        this.msgFlag = msgFlag;return this;
    }
}
