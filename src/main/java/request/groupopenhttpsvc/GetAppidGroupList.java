package request.groupopenhttpsvc;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import request.GeneralModel;

@Command("get_appid_group_list")
public class GetAppidGroupList extends GeneralModel {
    @JSONField(name = "Limit")
    private Integer limit;
    @JSONField(name = "Next")
    private Integer next;
    @JSONField(name = "GroupType")
    private String groupType;
    public GetAppidGroupList(String serviceName) {
        super(serviceName);
    }

    @Override
    public String checkParam() {
        return null;
    }

    public Integer getLimit() {
        return limit;
    }

    public GetAppidGroupList setLimit(Integer limit) {
        this.limit = limit;return this;
    }

    public Integer getNext() {
        return next;
    }

    public GetAppidGroupList setNext(Integer next) {
        this.next = next;return this;
    }

    public String getGroupType() {
        return groupType;
    }

    public GetAppidGroupList setGroupType(String groupType) {
        this.groupType = groupType;return this;
    }
}
