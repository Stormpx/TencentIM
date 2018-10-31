package request.groupopenhttpsvc;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import request.GeneralRequest;
import response.GeneralResponse;
import util.VariableUtil;

@Command("destroy_group")
public class DestroyGroupRequest extends GeneralRequest<GeneralResponse> {
    @JSONField(name = "GroupId")
    private String groupId;
    public DestroyGroupRequest(String serviceName) {
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

    public DestroyGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;return this;
    }
}
