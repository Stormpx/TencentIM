package request.groupopenhttpsvc;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import model.MemberImport;
import request.GeneralRequest;
import response.ImportGroupMemberResponse;
import util.VariableUtil;

import java.util.ArrayList;
import java.util.List;

@Command("import_group_member")
public class ImportGroupMemberRequest extends GeneralRequest<ImportGroupMemberResponse> {
    @JSONField(name = "GroupId")
    private String groupId;
    @JSONField(name = "MemberList")
    private List<MemberImport> memberList;

    public ImportGroupMemberRequest(String serviceName) {
        super(serviceName);
    }

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

    public String getGroupId() {
        return groupId;
    }

    public ImportGroupMemberRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    public List<MemberImport> getMemberList() {
        return memberList;
    }

    public ImportGroupMemberRequest setMemberList(List<MemberImport> memberList) {
        this.memberList = memberList;
        return this;
    }

    public ImportGroupMemberRequest setMemberList(MemberImport... memberList) {
        if (this.memberList == null) {
            this.memberList = new ArrayList<>();
        }
        return this;
    }
}
