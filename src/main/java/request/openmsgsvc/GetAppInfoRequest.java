package request.openmsgsvc;

import com.alibaba.fastjson.annotation.JSONField;
import request.GeneralRequest;

import java.util.List;

public class GetAppInfoRequest extends GeneralRequest {
    @JSONField(name = "RequestField")
    private List<String> requestField;

    @Override
    protected String checkParam() {
        return null;
    }

    public List<String> getRequestField() {
        return requestField;
    }

    public GetAppInfoRequest setRequestField(List<String> requestField) {
        this.requestField = requestField;return this;
    }
}
