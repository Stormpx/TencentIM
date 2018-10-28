package request.groupopenhttpsvc;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import model.AppDefinedData;
import model.Member;
import request.GeneralModel;
import util.VariableUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Command("create_group")
public class CreateGroup extends GeneralModel {
    @JSONField(name = "Owner_Account")
    private String ownerAccount;
    @JSONField(name = "Type")
    private String groupType;
    @JSONField(name = "GroupId")
    private String groupId;
    @JSONField(name = "Name")
    private String name;
    @JSONField(name = "Introduction")
    private String introduction;
    @JSONField(name = "Notification")
    private String notification;
    @JSONField(name = "FaceUrl")
    private String faceUrl;
    @JSONField(name = "MaxMemberCount")
    private Integer maxMemberCount;
    @JSONField(name = "ApplyJoinOption")
    private String applyJoinOption;
    @JSONField(name = "AppDefinedData")
    private List<AppDefinedData> appDefinedData;
    @JSONField(name = "MemberList")
    private List<Member> memberList;

    public CreateGroup(String serviceName) {
        super(serviceName);
    }

    @Override
    public String checkParam() {
        if (VariableUtil.isEmpty(groupType)){
            return "Type";
        }
        if (VariableUtil.isEmpty(name)){
            return "Name";
        }
        return null;
    }

    public CreateGroup setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;return this;
    }

    public CreateGroup setGroupType(String groupType) {
        this.groupType = groupType;return this;
    }

    public CreateGroup setGroupId(String groupId) {
        this.groupId = groupId;return this;
    }

    public CreateGroup setName(String name) {
        this.name = name;return this;
    }

    public CreateGroup setIntroduction(String introduction) {
        this.introduction = introduction;return this;
    }

    public CreateGroup setNotification(String notification) {
        this.notification = notification;return this;
    }

    public CreateGroup setFaceUrl(String faceUrl) {
        this.faceUrl = faceUrl;return this;
    }

    public CreateGroup setMaxMemberCount(Integer maxMemberCount) {
        this.maxMemberCount = maxMemberCount;return this;
    }

    public CreateGroup setApplyJoinOption(String applyJoinOption) {
        this.applyJoinOption = applyJoinOption;return this;
    }

    public CreateGroup setAppDefinedData(List<AppDefinedData> appDefinedData) {
        this.appDefinedData = appDefinedData;return this;
    }

    public CreateGroup setAppDefinedData(AppDefinedData... appDefinedData) {
        if (this.appDefinedData==null){
            this.appDefinedData=new ArrayList<>();
        }
        Collections.addAll(this.appDefinedData,appDefinedData);return this;
    }
    public CreateGroup setMemberList(List<Member> memberList) {
        this.memberList = memberList;return this;
    }
    public CreateGroup setMemberList(Member... memberList) {
        if (this.memberList==null){
            this.memberList=new ArrayList<>();
        }
        Collections.addAll(this.memberList,memberList);return this;
    }

    public String getOwnerAccount() {
        return ownerAccount;
    }

    public String getGroupType() {
        return groupType;
    }

    public String getGroupId() {
        return groupId;
    }

    public String getName() {
        return name;
    }

    public String getIntroduction() {
        return introduction;
    }

    public String getNotification() {
        return notification;
    }

    public String getFaceUrl() {
        return faceUrl;
    }

    public Integer getMaxMemberCount() {
        return maxMemberCount;
    }

    public String getApplyJoinOption() {
        return applyJoinOption;
    }

    public List<AppDefinedData> getAppDefinedData() {
        return appDefinedData;
    }

    public List<Member> getMemberList() {
        return memberList;
    }
}
