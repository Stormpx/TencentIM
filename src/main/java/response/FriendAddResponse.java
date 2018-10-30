package response;

import model.ResultItem;

import java.util.List;

public class FriendAddResponse  extends GeneralResponse{
    private List<ResultItem> ResultItem;
    private List<String> Fail_Account;
    private List<String> Invalid_Account;

    public List<ResultItem> getResultItem() {
        return ResultItem;
    }

    public void setResultItem(List<ResultItem> resultItem) {
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
