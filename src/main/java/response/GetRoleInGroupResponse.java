package response;

import model.Member;

import java.util.List;

public class GetRoleInGroupResponse extends GeneralResponse{
    private List<Member> UserIdList;

    public List<Member> getUserIdList() {
        return UserIdList;
    }

    public void setUserIdList(List<Member> userIdList) {
        UserIdList = userIdList;
    }
}
