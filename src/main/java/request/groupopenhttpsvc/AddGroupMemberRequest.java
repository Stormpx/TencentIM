package request.groupopenhttpsvc;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import model.Member;
import request.GeneralRequest;
import response.AddGroupMemberResponse;
import util.VariableUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Command("add_group_member")
public class AddGroupMemberRequest extends GeneralRequest<AddGroupMemberResponse> {
    @JSONField(name = "GroupId")
    private String groupId;
    @JSONField(name = "Silence")
    private Integer silence;
    @JSONField(name = "MemberList")
    private List<Member> memberList;

    @Override
    protected String checkParam() {
        if (VariableUtil.isEmpty(groupId)){
            return "GroupId";
        }
        if (VariableUtil.isEmpty(memberList)){
            return "MemberList";
        }
        return null;
    }

    public AddGroupMemberRequest setGroupId(String groupId) {
        this.groupId = groupId;return this;
    }

    public AddGroupMemberRequest setSilence(Integer silence) {
        this.silence = silence;return this;
    }

    public AddGroupMemberRequest setMemberList(List<Member> memberList) {
        this.memberList = memberList;return this;
    }
    public AddGroupMemberRequest setMemberList(Member... memberList) {
        if (this.memberList==null){
            this.memberList=new ArrayList<>();
        }
        Collections.addAll(this.memberList,memberList);
        return this;
    }

    public String getGroupId() {
        return groupId;
    }

    public Integer getSilence() {
        return silence;
    }

    public List<Member> getMemberList() {
        return memberList;
    }
}
