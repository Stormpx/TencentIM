package request.groupopenhttpsvc;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import request.GeneralModel;
import util.VariableUtil;

@Command("destroy_group")
public class DestroyGroup extends GeneralModel {
    @JSONField(name = "GroupId")
    private String groupId;
    public DestroyGroup(String serviceName) {
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

    public DestroyGroup setGroupId(String groupId) {
        this.groupId = groupId;return this;
    }
}
