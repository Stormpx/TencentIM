package request.groupopenhttpsvc;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import model.AppDefinedData;
import request.GeneralRequest;
import response.ImportGroupResponse;
import util.VariableUtil;

import java.util.List;

@Command("import_group")
public class ImportGroupRequest extends GeneralRequest<ImportGroupResponse> {
    @JSONField(name = "Owner_Account")
    private String ownerAccount;
    @JSONField(name = "Type")
    private String type;
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
    @JSONField(name = "CreateTime")
    private Integer createTime;


    @Override
    protected String checkParam() {
        if (VariableUtil.isEmpty(type)){
            return "Type";
        }
        if (VariableUtil.isEmpty(name)){
            return "Name";
        }
        return null;
    }

    public ImportGroupRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;return this;
    }

    public ImportGroupRequest setType(String type) {
        this.type = type;return this;
    }

    public ImportGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;return this;
    }

    public ImportGroupRequest setName(String name) {
        this.name = name;return this;
    }

    public ImportGroupRequest setIntroduction(String introduction) {
        this.introduction = introduction;return this;
    }

    public ImportGroupRequest setNotification(String notification) {
        this.notification = notification;return this;
    }

    public ImportGroupRequest setFaceUrl(String faceUrl) {
        this.faceUrl = faceUrl;return this;
    }

    public ImportGroupRequest setMaxMemberCount(Integer maxMemberCount) {
        this.maxMemberCount = maxMemberCount;return this;
    }

    public ImportGroupRequest setApplyJoinOption(String applyJoinOption) {
        this.applyJoinOption = applyJoinOption;return this;
    }

    public ImportGroupRequest setAppDefinedData(List<AppDefinedData> appDefinedData) {
        this.appDefinedData = appDefinedData;return this;
    }

    public ImportGroupRequest setCreateTime(Integer createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getOwnerAccount() {
        return ownerAccount;
    }

    public String getType() {
        return type;
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

    public Integer getCreateTime() {
        return createTime;
    }
}
