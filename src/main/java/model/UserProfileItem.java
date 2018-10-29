package model;

import java.util.List;

public class UserProfileItem {
    private String To_Account;
    private Integer ResultCode;
    private String ResultInfo;
    private List<ProfileTag> ProfileItem;

    public String getTo_Account() {
        return To_Account;
    }

    public void setTo_Account(String to_Account) {
        To_Account = to_Account;
    }

    public Integer getResultCode() {
        return ResultCode;
    }

    public void setResultCode(Integer resultCode) {
        ResultCode = resultCode;
    }

    public String getResultInfo() {
        return ResultInfo;
    }

    public void setResultInfo(String resultInfo) {
        ResultInfo = resultInfo;
    }

    public List<ProfileTag> getProfileItem() {
        return ProfileItem;
    }

    public void setProfileItem(List<ProfileTag> profileItem) {
        ProfileItem = profileItem;
    }
}
