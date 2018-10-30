package response;

import model.GroupInfo;

import java.util.List;

public class GetGroupInfoResponse extends GeneralResponse{
    private List<GroupInfo> GroupInfo;

    public List<model.GroupInfo> getGroupInfo() {
        return GroupInfo;
    }

    public void setGroupInfo(List<model.GroupInfo> groupInfo) {
        GroupInfo = groupInfo;
    }

}
