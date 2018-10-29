package request.groupopenhttpsvc;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import request.GeneralModel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Command("delete_group_member")
public class DeleteGroupMember extends GeneralModel {
    @JSONField(name = "GroupId")
    private String groupId;
    @JSONField(name = "Silence")
    private Integer silence;
    @JSONField(name = "Reason")
    private String reason;
    @JSONField(name = "MemberToDel_Account")
    private List<String> memberToDelAccount;
    public DeleteGroupMember(String serviceName) {
        super(serviceName);
    }

    @Override
    public String checkParam() {
        return null;
    }

    public DeleteGroupMember setGroupId(String groupId) {
        this.groupId = groupId;return this;
    }

    public DeleteGroupMember setSilence(Integer silence) {
        this.silence = silence;return this;
    }

    public DeleteGroupMember setReason(String reason) {
        this.reason = reason;return this;
    }

    public DeleteGroupMember setMemberToDelAccount(List<String> memberToDelAccount) {
        this.memberToDelAccount = memberToDelAccount;return this;
    }
    public DeleteGroupMember setMemberToDelAccount(String... memberToDelAccount) {
        if (this.memberToDelAccount==null){
            this.memberToDelAccount=new ArrayList<>();
        }
        Collections.addAll(this.memberToDelAccount,memberToDelAccount);
        return this;
    }

    public String getGroupId() {
        return groupId;
    }

    public Integer getSilence() {
        return silence;
    }

    public String getReason() {
        return reason;
    }

    public List<String> getMemberToDelAccount() {
        return memberToDelAccount;
    }
}
