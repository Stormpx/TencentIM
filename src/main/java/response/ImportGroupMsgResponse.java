package response;

import model.ImportMsgResult;

import java.util.List;

public class ImportGroupMsgResponse extends GeneralResponse{
    private List<ImportMsgResult> ImportMsgResult;

    public List<model.ImportMsgResult> getImportMsgResult() {
        return ImportMsgResult;
    }

    public void setImportMsgResult(List<model.ImportMsgResult> importMsgResult) {
        ImportMsgResult = importMsgResult;
    }

}
