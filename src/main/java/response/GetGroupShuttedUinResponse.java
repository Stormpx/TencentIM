package response;

import model.ShuttedUin;

import java.util.List;

public class GetGroupShuttedUinResponse extends GeneralResponse{
    private String GroupId;
    private List<ShuttedUin> shuttedUinList;

    public String getGroupId() {
        return GroupId;
    }

    public void setGroupId(String groupId) {
        GroupId = groupId;
    }

    public List<model.ShuttedUin> getShuttedUinList() {
        return shuttedUinList;
    }

    public void setShuttedUinList(List<model.ShuttedUin> shuttedUinList) {
        this.shuttedUinList = shuttedUinList;
    }
}
