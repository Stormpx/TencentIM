package request.groupopenhttpsvc;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import model.Member;
import request.GeneralModel;
import util.VariableUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Command("add_group_member")
public class AddGroupMember extends GeneralModel {
    @JSONField(name = "GroupId")
    private String groupId;
    @JSONField(name = "Silence")
    private Integer silence;
    @JSONField(name = "MemberList")
    private List<Member> memberList;
    public AddGroupMember(String serviceName) {
        super(serviceName);
    }

    @Override
    public String checkParam() {
        if (VariableUtil.isEmpty(groupId)){
            return "GroupId";
        }
        if (VariableUtil.isEmpty(memberList)){
            return "MemberList";
        }
        return null;
    }

    public AddGroupMember setGroupId(String groupId) {
        this.groupId = groupId;return this;
    }

    public AddGroupMember setSilence(Integer silence) {
        this.silence = silence;return this;
    }

    public AddGroupMember setMemberList(List<Member> memberList) {
        this.memberList = memberList;return this;
    }
    public AddGroupMember setMemberList(Member... memberList) {
        if (this.memberList==null){
            this.memberList=new ArrayList<>();
        }
        Collections.addAll(this.memberList,memberList);
        return this;
    }
}
