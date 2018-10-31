package response;

import java.util.List;
import java.util.Map;

public class GetAppidGroupListResponse extends GeneralResponse{
    private Integer TotalCount;
    private Long Next;
    private List<Map<String,String>> GroupIdList;

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

    public List<Map<String, String>> getGroupIdList() {
        return GroupIdList;
    }

    public void setGroupIdList(List<Map<String, String>> groupIdList) {
        GroupIdList = groupIdList;
    }
}
