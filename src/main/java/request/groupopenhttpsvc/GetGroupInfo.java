package request.groupopenhttpsvc;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import model.ResponseFilter;
import request.GeneralModel;
import util.VariableUtil;

import java.util.List;

@Command("get_group_info")
public class GetGroupInfo extends GeneralModel {
    @JSONField(name="GroupIdList")
    private List<String> groupIdList;
    @JSONField(name = "ResponseFilter")
    private ResponseFilter responseFilter;
    public GetGroupInfo(String serviceName) {
        super(serviceName);
    }

    @Override
    public String checkParam() {
        if (VariableUtil.isEmpty(groupIdList)){
            return "GroupIdList";
        }
        return null;
    }

    public GetGroupInfo setGroupIdList(List<String> groupIdList) {
        this.groupIdList = groupIdList;return this;
    }

    public GetGroupInfo setResponseFilter(ResponseFilter responseFilter) {
        this.responseFilter = responseFilter;return this;
    }

    public List<String> getGroupIdList() {
        return groupIdList;
    }

    public ResponseFilter getResponseFilter() {
        return responseFilter;
    }
}
