package request.groupopenhttpsvc;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import model.AppDefinedData;
import request.GeneralModel;
import util.VariableUtil;

import java.util.List;

@Command("import_group")
public class ImportGroup extends GeneralModel {
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

    public ImportGroup(String serviceName) {
        super(serviceName);
    }

    @Override
    public String checkParam() {
        if (VariableUtil.isEmpty(type)){
            return "Type";
        }
        if (VariableUtil.isEmpty(name)){
            return "Name";
        }
        return null;
    }

    public ImportGroup setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;return this;
    }

    public ImportGroup setType(String type) {
        this.type = type;return this;
    }

    public ImportGroup setGroupId(String groupId) {
        this.groupId = groupId;return this;
    }

    public ImportGroup setName(String name) {
        this.name = name;return this;
    }

    public ImportGroup setIntroduction(String introduction) {
        this.introduction = introduction;return this;
    }

    public ImportGroup setNotification(String notification) {
        this.notification = notification;return this;
    }

    public ImportGroup setFaceUrl(String faceUrl) {
        this.faceUrl = faceUrl;return this;
    }

    public ImportGroup setMaxMemberCount(Integer maxMemberCount) {
        this.maxMemberCount = maxMemberCount;return this;
    }

    public ImportGroup setApplyJoinOption(String applyJoinOption) {
        this.applyJoinOption = applyJoinOption;return this;
    }

    public ImportGroup setAppDefinedData(List<AppDefinedData> appDefinedData) {
        this.appDefinedData = appDefinedData;return this;
    }

    public ImportGroup setCreateTime(Integer createTime) {
        this.createTime = createTime;
        return this;
    }
}
