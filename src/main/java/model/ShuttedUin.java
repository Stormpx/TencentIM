package model;

public class ShuttedUin {
    private String Member_Account;
    private Long ShuttedUntil;

    public Long getShuttedUntil() {
        return ShuttedUntil;
    }

    public void setShuttedUntil(Long shuttedUntil) {
        ShuttedUntil = shuttedUntil;
    }

    public String getMember_Account() {
        return Member_Account;
    }

    public void setMember_Account(String member_Account) {
        Member_Account = member_Account;
    }
}
