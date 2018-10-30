package response;

import com.alibaba.fastjson.JSONObject;
import model.InfoItem;

import java.util.List;

public class FriendGetListResponse extends GeneralResponse{
    private List<InfoItem> infoItem;
    private List<String> Fail_Account;
    private List<String> Invalid_Account;

    public List<InfoItem> getInfoItem() {
        return infoItem;
    }

    public void setInfoItem(List<InfoItem> infoItem) {
        this.infoItem = infoItem;
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
