package request.groupopenhttpsvc;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import request.GeneralRequest;
import response.GetGroupShuttedUinResponse;
import util.VariableUtil;

@Command("get_group_shutted_uin")
public class GetGroupShuttedUinRequest extends GeneralRequest<GetGroupShuttedUinResponse> {
    @JSONField(name = "GroupId")
    private String groupId;
    public GetGroupShuttedUinRequest(String serviceName) {
        super(serviceName);
    }

    @Override
    protected String checkParam() {
        if (VariableUtil.isEmpty(groupId)){
            return "GroupId";
        }
        return null;
    }

    public String getGroupId() {
        return groupId;
    }

    public GetGroupShuttedUinRequest setGroupId(String groupId) {
        this.groupId = groupId;return this;
    }
}
