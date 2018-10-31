package model;

import java.util.List;

public class InfoItem {
    private String To_Account;
    private List<SnsProfileItem> SnsProfileItem;
    private Integer ResultCode;
    private String ResultInfo;
    public String getTo_Account() {
        return To_Account;
    }

    public void setTo_Account(String to_Account) {
        To_Account = to_Account;
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
