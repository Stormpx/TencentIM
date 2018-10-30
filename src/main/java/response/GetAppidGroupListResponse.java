package response;

import java.util.List;

public class GetAppidGroupListResponse extends GeneralResponse{
    private Integer TotalCount;
    private Long Next;
    private List<String> GroupIdList;

    public Integer getTotalCount() {
        return TotalCount;
    }

    public void setTotalCount(Integer totalCount) {
        TotalCount = totalCount;
    }

    public Long getNext() {
        return Next;
    }

    public void setNext(Long next) {
        Next = next;
    }

    public List<String> getGroupIdList() {
        return GroupIdList;
    }

    public void setGroupIdList(List<String> groupIdList) {
        GroupIdList = groupIdList;
    }
}
