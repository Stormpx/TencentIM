package response;

import java.util.List;

public class BatchSendMsgResponse {
    private List<BatchSendMsgError> ErrorList;

    public List<BatchSendMsgError> getErrorList() {
        return ErrorList;
    }

    public void setErrorList(List<BatchSendMsgError> errorList) {
        ErrorList = errorList;
    }
}
