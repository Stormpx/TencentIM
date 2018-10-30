package request.groupopenhttpsvc;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import model.AppDefinedData;
import request.GeneralRequest;
import response.GeneralResponse;
import util.VariableUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Command("modify_group_base_info")
public class ModifyGroupBaseInfoRequest extends GeneralRequest<GeneralResponse> {
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
    public ModifyGroupBaseInfoRequest(String serviceName) {
        super(serviceName);
    }

    @Override
    public String checkParam() {
        if (VariableUtil.isEmpty(groupId)){
            return "GroupId";
        }
        return null;
    }

    public ModifyGroupBaseInfoRequest setGroupId(String groupId) {
        this.groupId = groupId;return this;
    }

    public ModifyGroupBaseInfoRequest setName(String name) {
        this.name = name;return this;
    }

    public ModifyGroupBaseInfoRequest setIntroduction(String introduction) {
        this.introduction = introduction;return this;
    }

    public ModifyGroupBaseInfoRequest setNotification(String notification) {
        this.notification = notification;return this;
    }

    public ModifyGroupBaseInfoRequest setFaceUrl(String faceUrl) {
        this.faceUrl = faceUrl;return this;
    }

    public ModifyGroupBaseInfoRequest setMaxMemberCount(Integer maxMemberCount) {
        this.maxMemberCount = maxMemberCount;return this;
    }

    public ModifyGroupBaseInfoRequest setApplyJoinOption(String applyJoinOption) {
        this.applyJoinOption = applyJoinOption;return this;
    }

    public ModifyGroupBaseInfoRequest setAppDefinedData(List<AppDefinedData> appDefinedData) {
        this.appDefinedData = appDefinedData;return this;
    }

    public ModifyGroupBaseInfoRequest setAppDefinedData(AppDefinedData... appDefinedData) {
        if (this.appDefinedData==null){
            this.appDefinedData=new ArrayList<>();
        }
        Collections.addAll(this.appDefinedData,appDefinedData);return this;
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
}
