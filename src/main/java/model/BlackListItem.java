package model;

public class BlackListItem {
    private String Black_Account;
    private Integer BlackTimeStamp;

    public String getBlack_Account() {
        return Black_Account;
    }

    public void setBlack_Account(String black_Account) {
        Black_Account = black_Account;
    }

    public Integer getBlackTimeStamp() {
        return BlackTimeStamp;
    }

    public void setBlackTimeStamp(Integer blackTimeStamp) {
        BlackTimeStamp = blackTimeStamp;
    }
}
