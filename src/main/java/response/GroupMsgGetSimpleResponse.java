package response;

import model.RspMsg;

import java.util.List;

public class GroupMsgGetSimpleResponse extends GeneralResponse{
    private String GroupId;
    private Integer IsFinished;
    private List<RspMsg> RspMsgList;

    public String getGroupId() {
        return GroupId;
    }

    public void setGroupId(String groupId) {
        GroupId = groupId;
    }

    public Integer getIsFinished() {
        return IsFinished;
    }

    public void setIsFinished(Integer isFinished) {
        IsFinished = isFinished;
    }

    public List<RspMsg> getRspMsgList() {
        return RspMsgList;
    }

    public void setRspMsgList(List<RspMsg> rspMsgList) {
        RspMsgList = rspMsgList;
    }
}
