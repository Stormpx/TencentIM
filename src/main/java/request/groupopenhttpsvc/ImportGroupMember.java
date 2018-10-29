package request.groupopenhttpsvc;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import model.MemberImport;
import request.GeneralModel;
import util.VariableUtil;

import java.util.ArrayList;
import java.util.List;

@Command("import_group_member")
public class ImportGroupMember extends GeneralModel {
    @JSONField(name = "GroupId")
    private String groupId;
    @JSONField(name = "MemberList")
    private List<MemberImport> memberList;

    public ImportGroupMember(String serviceName) {
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

    public String getGroupId() {
        return groupId;
    }

    public ImportGroupMember setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    public List<MemberImport> getMemberList() {
        return memberList;
    }

    public ImportGroupMember setMemberList(List<MemberImport> memberList) {
        this.memberList = memberList;
        return this;
    }

    public ImportGroupMember setMemberList(MemberImport... memberList) {
        if (this.memberList == null) {
            this.memberList = new ArrayList<>();
        }
        return this;
    }
}
