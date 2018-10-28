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
    private Integer lastSendMsgTime;
    @JSONField(name = "NameCard")
    private String nameCard;
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

    public Integer getLastSendMsgTime() {
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
}
