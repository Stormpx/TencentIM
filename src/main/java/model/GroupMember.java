package model;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GroupMember  {
    @JSONField(name = "Member_Account")
    private String memberAccount;
    @JSONField(name = "Role")
    private String role;
    @JSONField(name = "JoinTime")
    private Integer jionTime;
    @JSONField(name = "MsgSeq")
    private Integer msgSeq;
    @JSONField(name = "MsgFlag")
    private String msgFlag;
    @JSONField(name = "LastSendMsgTime")
    private Long lastSendMsgTime;
    @JSONField(name = "ShutUpUntil")
    private Long ShutUpUntil;
    @JSONField(name = "NameCard")
    private String nameCard;
    @JSONField(name = "UnreadMsgNum")
    private String unreadMsgNum;
    @JSONField(name = "AppMemberDefinedData")
    private List<AppDefinedData> appDefinedData;

    public GroupMember setMemberAccount(String memberAccount) {
        this.memberAccount = memberAccount;return this;
    }

    public GroupMember setRole(String role) {
        this.role = role;return this;
    }

    public GroupMember setMsgFlag(String msgFlag) {
        this.msgFlag = msgFlag;return this;
    }

    public GroupMember setNameCard(String nameCard) {
        this.nameCard = nameCard;return this;
    }

    public String getMemberAccount() {
        return memberAccount;
    }

    public String getRole() {
        return role;
    }

    public Integer getJionTime() {
        return jionTime;
    }

    public Integer getMsgSeq() {
        return msgSeq;
    }

    public String getMsgFlag() {
        return msgFlag;
    }

    public Long getLastSendMsgTime() {
        return lastSendMsgTime;
    }

    public String getNameCard() {
        return nameCard;
    }
    public GroupMember setAppDefinedData(List<AppDefinedData> appDefinedData) {
        this.appDefinedData = appDefinedData;return this;
    }
    public GroupMember setAppDefinedData(AppDefinedData... appDefinedData) {
        if (this.appDefinedData==null){
            this.appDefinedData=new ArrayList<>();
        }
        Collections.addAll(this.appDefinedData,appDefinedData);return this;
    }

    public GroupMember setJionTime(Integer jionTime) {
        this.jionTime = jionTime;return this;
    }

    public GroupMember setMsgSeq(Integer msgSeq) {
        this.msgSeq = msgSeq;return this;
    }

    public GroupMember setLastSendMsgTime(Long lastSendMsgTime) {
        this.lastSendMsgTime = lastSendMsgTime;return this;
    }

    public Long getShutUpUntil() {
        return ShutUpUntil;
    }

    public GroupMember setShutUpUntil(Long shutUpUntil) {
        ShutUpUntil = shutUpUntil;
        return this;
    }

    public List<AppDefinedData> getAppDefinedData() {
        return appDefinedData;
    }

    public String getUnreadMsgNum() {
        return unreadMsgNum;
    }

    public GroupMember setUnreadMsgNum(String unreadMsgNum) {
        this.unreadMsgNum = unreadMsgNum;return this;
    }
}
