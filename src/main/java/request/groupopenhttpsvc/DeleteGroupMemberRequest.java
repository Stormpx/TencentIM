package request.groupopenhttpsvc;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import request.GeneralRequest;
import response.GeneralResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Command("delete_group_member")
public class DeleteGroupMemberRequest extends GeneralRequest<GeneralResponse> {
    @JSONField(name = "GroupId")
    private String groupId;
    @JSONField(name = "Silence")
    private Integer silence;
    @JSONField(name = "Reason")
    private String reason;
    @JSONField(name = "MemberToDel_Account")
    private List<String> memberToDelAccount;

    @Override
    protected String checkParam() {
        return null;
    }

    public DeleteGroupMemberRequest setGroupId(String groupId) {
        this.groupId = groupId;return this;
    }

    public DeleteGroupMemberRequest setSilence(Integer silence) {
        this.silence = silence;return this;
    }

    public DeleteGroupMemberRequest setReason(String reason) {
        this.reason = reason;return this;
    }

    public DeleteGroupMemberRequest setMemberToDelAccount(List<String> memberToDelAccount) {
        this.memberToDelAccount = memberToDelAccount;return this;
    }
    public DeleteGroupMemberRequest setMemberToDelAccount(String... memberToDelAccount) {
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
