package response;

import model.RecallRet;

import java.util.List;

public class GroupMsgRecallResponse extends GeneralResponse{
    private List<RecallRet> RecallRetList;

    public List<RecallRet> getRecallRetList() {
        return RecallRetList;
    }

    public void setRecallRetList(List<RecallRet> recallRetList) {
        RecallRetList = recallRetList;
    }
}
