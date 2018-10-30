package response;

import model.CheckItem;

import java.util.List;

public class FriendCheckResponse extends GeneralResponse{
    private List<CheckItem> CheckItem;
    private List<String> Fail_Account;
    private List<String> Invalid_Account;

    public List<model.CheckItem> getCheckItem() {
        return CheckItem;
    }

    public void setCheckItem(List<model.CheckItem> checkItem) {
        CheckItem = checkItem;
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
