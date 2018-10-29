package response;

import com.alibaba.fastjson.JSONObject;

public class GeneralResponse {
    private String ActionStatus;
    private String ErrorInfo;
    private Integer ErrorCode;
    private String ErrorDisplay;
    private JSONObject responseResult;
    public String getActionStatus() {
        return ActionStatus;
    }
    public void setActionStatus(String actionStatus) {
        ActionStatus = actionStatus;
    }

    public String getErrorInfo() {
        return ErrorInfo;
    }

    public void setErrorInfo(String errorInfo) {
        ErrorInfo = errorInfo;
    }

    public Integer getErrorCode() {
        return ErrorCode;
    }

    public void setErrorCode(Integer errorCode) {
        ErrorCode = errorCode;
    }

    public JSONObject getResponseResult() {
        return responseResult;
    }

    public void setResponseResult(JSONObject responseResult) {
        this.responseResult = responseResult;
    }

    public String getErrorDisplay() {
        return ErrorDisplay;
    }

    public void setErrorDisplay(String errorDisplay) {
        ErrorDisplay = errorDisplay;
    }

    @Override
    public String toString() {
        return "GeneralResponse{" +
                "ActionStatus='" + ActionStatus + '\'' +
                ", ErrorInfo='" + ErrorInfo + '\'' +
                ", ErrorCode=" + ErrorCode +
                ", ErrorDisplay='" + ErrorDisplay + '\'' +
                ", responseResult=" + responseResult +
                '}';
    }
}
