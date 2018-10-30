package response;

import model.GroupIdInfo;
import model.GroupInfo;

import java.util.List;

public class GetJoinedGroupListResponse extends GeneralResponse{
    private Integer TotalCount;
    private List<GroupIdInfo> GroupIdList;


    public Integer getTotalCount() {
        return TotalCount;
    }

    public void setTotalCount(Integer totalCount) {
        TotalCount = totalCount;
    }

    public List<GroupIdInfo> getGroupIdList() {
        return GroupIdList;
    }

    public void setGroupIdList(List<GroupIdInfo> groupIdList) {
        GroupIdList = groupIdList;
    }

}
