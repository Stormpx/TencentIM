package model;

public class BlackListItem {
    private String To_Account;
    private Integer AddBlackTimeStamp;

    public String getTo_Account() {
        return To_Account;
    }

    public void setTo_Account(String to_Account) {
        To_Account = to_Account;
    }

    public Integer getAddBlackTimeStamp() {
        return AddBlackTimeStamp;
    }

    public void setAddBlackTimeStamp(Integer addBlackTimeStamp) {
        AddBlackTimeStamp = addBlackTimeStamp;
    }
}
