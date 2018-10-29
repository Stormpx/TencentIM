package response;

import com.alibaba.fastjson.JSONObject;
import model.ProfileTag;
import model.UserProfileItem;

import java.util.List;

public class PortraitGetResponse {
    private List<UserProfileItem> UserProfileItem;
    private List<String> Fail_Account;
    private List<String> Invalid_Account;

    public List<model.UserProfileItem> getUserProfileItem() {
        return UserProfileItem;
    }

    public void setUserProfileItem(List<model.UserProfileItem> userProfileItem) {
        UserProfileItem = userProfileItem;
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
