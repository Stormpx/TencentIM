package model;

import com.alibaba.fastjson.annotation.JSONField;

public class MemberImport {
    @JSONField(name = "Member_Account")
    private String memberAccount;
    @JSONField(name = "Role")
    private String role;
    @JSONField(name = "JoinTime")
    private String joinTime;
    @JSONField(name = "UnreadMsgNum")
    private String unreadMsgNum;

    public String getMemberAccount() {
        return memberAccount;
    }

    public MemberImport setMemberAccount(String memberAccount) {
        this.memberAccount = memberAccount;return this;
    }

    public String getRole() {
        return role;
    }

    public MemberImport setRole(String role) {
        this.role = role;return this;
    }

    public String getJoinTime() {
        return joinTime;
    }

    public MemberImport setJoinTime(String joinTime) {
        this.joinTime = joinTime;return this;
    }

    public String getUnreadMsgNum() {
        return unreadMsgNum;
    }

    public MemberImport setUnreadMsgNum(String unreadMsgNum) {
        this.unreadMsgNum = unreadMsgNum;return this;
    }
}
