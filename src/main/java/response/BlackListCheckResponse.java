package response;

import java.util.List;

public class BlackListCheckResponse extends GeneralResponse{
    private List<model.ResultItem> BlackListCheckItem;
    private List<String> Fail_Account;
    private List<String> Invalid_Account;

    public List<model.ResultItem> getBlackListCheckItem() {
        return BlackListCheckItem;
    }

    public void setBlackListCheckItem(List<model.ResultItem> blackListCheckItem) {
        BlackListCheckItem = blackListCheckItem;
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
