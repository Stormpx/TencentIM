package request.groupopenhttpsvc;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import request.GeneralRequest;
import response.GetAppidGroupListResponse;

@Command("get_appid_group_list")
public class GetAppidGroupListRequest extends GeneralRequest<GetAppidGroupListResponse> {
    @JSONField(name = "Limit")
    private Integer limit;
    @JSONField(name = "Next")
    private Integer next;
    @JSONField(name = "GroupType")
    private String groupType;

    @Override
    protected String checkParam() {
        return null;
    }

    public Integer getLimit() {
        return limit;
    }

    public GetAppidGroupListRequest setLimit(Integer limit) {
        this.limit = limit;return this;
    }

    public Integer getNext() {
        return next;
    }

    public GetAppidGroupListRequest setNext(Integer next) {
        this.next = next;return this;
    }

    public String getGroupType() {
        return groupType;
    }

    public GetAppidGroupListRequest setGroupType(String groupType) {
        this.groupType = groupType;return this;
    }
}
