package request.groupopenhttpsvc;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import model.ResponseFilter;
import request.GeneralRequest;
import response.GetJoinedGroupListResponse;
import util.VariableUtil;

@Command("get_joined_group_list")
public class GetJoinedGroupListRequest extends GeneralRequest<GetJoinedGroupListResponse> {
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
    public GetJoinedGroupListRequest(String serviceName) {
        super(serviceName);
    }

    @Override
    public String checkParam() {
        if (VariableUtil.isEmpty(memberAccount)){
            return "Member_Account";
        }
        return null;
    }

    public GetJoinedGroupListRequest setMemberAccount(String memberAccount) {
        this.memberAccount = memberAccount;return this;
    }

    public GetJoinedGroupListRequest setLimit(Integer limit) {
        this.limit = limit;return this;
    }

    public GetJoinedGroupListRequest setNext(Integer next) {
        this.next = next;return this;
    }

    public GetJoinedGroupListRequest setGroupType(String groupType) {
        this.groupType = groupType;return this;
    }

    public GetJoinedGroupListRequest setResponseFilter(ResponseFilter responseFilter) {
        this.responseFilter = responseFilter;return this;
    }
}
