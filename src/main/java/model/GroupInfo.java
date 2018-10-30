package model;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

public class GroupInfo {
    private String GroupId;
    private Integer ErrorCode;
    private Integer ErrorInfo;
    private String Type;
    private String Name;
    private String Introduction;
    private String Notification;
    private String FaceUrl;
    private String Owner_Account;
    private Long CreateTime;
    private Long LastInfoTime;
    private Long LastMsgTime;
    private Integer NextMsgSeq;
    private Integer MemberNum;
    private Integer MaxMemberNum;
    private String ApplyJoinOption;
    private String ShutUpAllMember;
    private List<AppDefinedData> AppDefinedData;
    private List<GroupMember> MemberList;

    public String getGroupId() {
        return GroupId;
    }

    public void setGroupId(String groupId) {
        GroupId = groupId;
    }

    public Integer getErrorCode() {
        return ErrorCode;
    }

    public void setErrorCode(Integer errorCode) {
        ErrorCode = errorCode;
    }

    public Integer getErrorInfo() {
        return ErrorInfo;
    }

    public void setErrorInfo(Integer errorInfo) {
        ErrorInfo = errorInfo;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getIntroduction() {
        return Introduction;
    }

    public void setIntroduction(String introduction) {
        Introduction = introduction;
    }

    public String getNotification() {
        return Notification;
    }

    public void setNotification(String notification) {
        Notification = notification;
    }

    public String getFaceUrl() {
        return FaceUrl;
    }

    public void setFaceUrl(String faceUrl) {
        FaceUrl = faceUrl;
    }

    public String getOwner_Account() {
        return Owner_Account;
    }

    public void setOwner_Account(String owner_Account) {
        Owner_Account = owner_Account;
    }

    public Long getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(Long createTime) {
        CreateTime = createTime;
    }

    public Long getLastInfoTime() {
        return LastInfoTime;
    }

    public void setLastInfoTime(Long lastInfoTime) {
        LastInfoTime = lastInfoTime;
    }

    public Long getLastMsgTime() {
        return LastMsgTime;
    }

    public void setLastMsgTime(Long lastMsgTime) {
        LastMsgTime = lastMsgTime;
    }

    public Integer getNextMsgSeq() {
        return NextMsgSeq;
    }

    public void setNextMsgSeq(Integer nextMsgSeq) {
        NextMsgSeq = nextMsgSeq;
    }

    public Integer getMemberNum() {
        return MemberNum;
    }

    public void setMemberNum(Integer memberNum) {
        MemberNum = memberNum;
    }

    public Integer getMaxMemberNum() {
        return MaxMemberNum;
    }

    public void setMaxMemberNum(Integer maxMemberNum) {
        MaxMemberNum = maxMemberNum;
    }

    public String getApplyJoinOption() {
        return ApplyJoinOption;
    }

    public void setApplyJoinOption(String applyJoinOption) {
        ApplyJoinOption = applyJoinOption;
    }

    public String getShutUpAllMember() {
        return ShutUpAllMember;
    }

    public void setShutUpAllMember(String shutUpAllMember) {
        ShutUpAllMember = shutUpAllMember;
    }

    public List<model.AppDefinedData> getAppDefinedData() {
        return AppDefinedData;
    }

    public void setAppDefinedData(List<model.AppDefinedData> appDefinedData) {
        AppDefinedData = appDefinedData;
    }

    public List<GroupMember> getMemberList() {
        return MemberList;
    }

    public void setMemberList(List<GroupMember> memberList) {
        MemberList = memberList;
    }
}
