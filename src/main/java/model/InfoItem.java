package model;

import java.util.List;

public class InfoItem {
    private String Info_Account;
    private List<SnsProfileItem> SnsProfileItem;
    private Integer ResultCode;
    private String ResultInfo;
    public String getInfo_Account() {
        return Info_Account;
    }

    public void setInfo_Account(String info_Account) {
        Info_Account = info_Account;
    }

    public List<model.SnsProfileItem> getSnsProfileItem() {
        return SnsProfileItem;
    }

    public void setSnsProfileItem(List<model.SnsProfileItem> snsProfileItem) {
        SnsProfileItem = snsProfileItem;
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
}
