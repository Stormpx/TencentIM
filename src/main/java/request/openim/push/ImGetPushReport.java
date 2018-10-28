package request.openim.push;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import request.GeneralModel;
import util.VariableUtil;

import java.util.List;

@Command("im_get_push_report")
public class ImGetPushReport extends GeneralModel {
    @JSONField(name = "TaskIds")
    private List<String> taskIds;

    public ImGetPushReport(String serviceName) {
        super(serviceName);
    }

    @Override
    public String checkParam() {
        if (VariableUtil.isEmpty(taskIds)){
            return "taskIds";
        }
        return null;
    }

    public List<String> getTaskIds() {
        return taskIds;
    }

    public ImGetPushReport setTaskIds(List<String> taskIds) {
        this.taskIds = taskIds;return this;
    }
}
