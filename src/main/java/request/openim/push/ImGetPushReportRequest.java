package request.openim.push;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import request.GeneralRequest;
import response.ImGetPushReportResponse;
import util.VariableUtil;

import java.util.List;

@Command("im_get_push_report")
public class ImGetPushReportRequest extends GeneralRequest<ImGetPushReportResponse> {
    @JSONField(name = "TaskIds")
    private List<String> taskIds;

    public ImGetPushReportRequest(String serviceName) {
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

    public ImGetPushReportRequest setTaskIds(List<String> taskIds) {
        this.taskIds = taskIds;return this;
    }
}
