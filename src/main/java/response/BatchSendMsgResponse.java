package response;

import model.BatchSendMsgError;

import java.util.List;

public class BatchSendMsgResponse extends GeneralResponse {
    private List<BatchSendMsgError> ErrorList;

    public List<BatchSendMsgError> getErrorList() {
        return ErrorList;
    }

    public void setErrorList(List<BatchSendMsgError> errorList) {
        ErrorList = errorList;
    }
}
