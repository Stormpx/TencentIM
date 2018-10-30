package response;

import model.ShuttedUin;

import java.util.List;

public class GetGroupShuttedUinResponse extends GeneralResponse{
    private String GroupId;
    private List<ShuttedUin> ShuttedUin;

    public String getGroupId() {
        return GroupId;
    }

    public void setGroupId(String groupId) {
        GroupId = groupId;
    }

    public List<model.ShuttedUin> getShuttedUin() {
        return ShuttedUin;
    }

    public void setShuttedUin(List<model.ShuttedUin> shuttedUin) {
        ShuttedUin = shuttedUin;
    }
}
