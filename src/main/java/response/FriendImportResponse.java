package response;

import com.alibaba.fastjson.JSONObject;
import model.ResultItem;

import java.util.List;

public class FriendImportResponse extends GeneralResponse{
    private List<ResultItem> ResultItem;
    private List<String> Fail_Account;
    private List<String> Invalid_Account;

    public List<model.ResultItem> getResultItem() {
        return ResultItem;
    }

    public void setResultItem(List<model.ResultItem> resultItem) {
        ResultItem = resultItem;
    }

    public List<String> getFail_Account() {
        return Fail_Account;
    }

    public void setFail_Account(List<String> fail_Account) {
        Fail_Account = fail_Account;
    }

    public List<String> getInvalid_Account() {
        return Invalid_Account;
    }

    public void setInvalid_Account(List<String> invalid_Account) {
        Invalid_Account = invalid_Account;
    }


}
