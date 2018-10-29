package request.groupopenhttpsvc;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import model.ResponseFilter;
import request.GeneralModel;
import util.VariableUtil;

@Command("get_joined_group_list")
public class GetJoinedGroupList extends GeneralModel {
    @JSONField(name = "Member_Account")
    private String memberAccount;
    @JSONField(name = "Limit")
    private Integer limit;
    @JSONField(name = "Next")
    private Integer next;
    @JSONField(name = "GroupType")
    private String groupType;
    @JSONField(name = "ResponseFilter")
    private ResponseFilter responseFilter;
    public GetJoinedGroupList(String serviceName) {
        super(serviceName);
    }

    @Override
    public String checkParam() {
        if (VariableUtil.isEmpty(memberAccount)){
            return "Member_Account";
        }
        return null;
    }

    public GetJoinedGroupList setMemberAccount(String memberAccount) {
        this.memberAccount = memberAccount;return this;
    }

    public GetJoinedGroupList setLimit(Integer limit) {
        this.limit = limit;return this;
    }

    public GetJoinedGroupList setNext(Integer next) {
        this.next = next;return this;
    }

    public GetJoinedGroupList setGroupType(String groupType) {
        this.groupType = groupType;return this;
    }

    public GetJoinedGroupList setResponseFilter(ResponseFilter responseFilter) {
        this.responseFilter = responseFilter;return this;
    }
}
