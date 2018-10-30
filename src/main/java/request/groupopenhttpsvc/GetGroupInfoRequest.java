package request.groupopenhttpsvc;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import model.ResponseFilter;
import request.GeneralRequest;
import response.GetGroupInfoResponse;
import util.VariableUtil;

import java.util.List;

@Command("get_group_info")
public class GetGroupInfoRequest extends GeneralRequest<GetGroupInfoResponse> {
    @JSONField(name="GroupIdList")
    private List<String> groupIdList;
    @JSONField(name = "ResponseFilter")
    private ResponseFilter responseFilter;
    public GetGroupInfoRequest(String serviceName) {
        super(serviceName);
    }

    @Override
    public String checkParam() {
        if (VariableUtil.isEmpty(groupIdList)){
            return "GroupIdList";
        }
        return null;
    }

    public GetGroupInfoRequest setGroupIdList(List<String> groupIdList) {
        this.groupIdList = groupIdList;return this;
    }

    public GetGroupInfoRequest setResponseFilter(ResponseFilter responseFilter) {
        this.responseFilter = responseFilter;return this;
    }

    public List<String> getGroupIdList() {
        return groupIdList;
    }

    public ResponseFilter getResponseFilter() {
        return responseFilter;
    }
}
