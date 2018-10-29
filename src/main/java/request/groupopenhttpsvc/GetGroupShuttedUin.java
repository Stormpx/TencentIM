package request.groupopenhttpsvc;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import request.GeneralModel;
import util.VariableUtil;

@Command("get_group_shutted_uin")
public class GetGroupShuttedUin extends GeneralModel {
    @JSONField(name = "GroupId")
    private String groupId;
    public GetGroupShuttedUin(String serviceName) {
        super(serviceName);
    }

    @Override
    public String checkParam() {
        if (VariableUtil.isEmpty(groupId)){
            return "GroupId";
        }
        return null;
    }

    public String getGroupId() {
        return groupId;
    }

    public GetGroupShuttedUin setGroupId(String groupId) {
        this.groupId = groupId;return this;
    }
}
