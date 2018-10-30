package response;

import model.MemberResult;

import java.util.List;

public class ImportGroupMemberResponse extends GeneralResponse{
    private List<MemberResult> MemberList;

    public List<MemberResult> getMemberList() {
        return MemberList;
    }

    public void setMemberList(List<MemberResult> memberList) {
        MemberList = memberList;
    }
}
