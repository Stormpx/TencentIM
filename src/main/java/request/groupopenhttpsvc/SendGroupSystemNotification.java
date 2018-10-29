package request.groupopenhttpsvc;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import request.GeneralModel;
import util.VariableUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Command("send_group_system_notification")
public class SendGroupSystemNotification extends GeneralModel {
    @JSONField(name = "GroupId")
    private String groupId;
    @JSONField(name = "ToMembers_Account")
    private List<String> toMembersAccount;
    @JSONField(name = "Content")
    private String content;
    public SendGroupSystemNotification(String serviceName) {
        super(serviceName);
    }

    @Override
    public String checkParam() {
        if (VariableUtil.isEmpty(groupId)){
            return "GroupId";
        }
        if (VariableUtil.isEmpty(content)){
            return "Content";
        }
        return null;
    }

    public SendGroupSystemNotification setGroupId(String groupId) {
        this.groupId = groupId;return this;
    }

    public SendGroupSystemNotification setToMembersAccount(List<String> toMembersAccount) {
        this.toMembersAccount = toMembersAccount;return this;
    }
    public SendGroupSystemNotification setToMembersAccount(String... toMembersAccount) {
        if (this.toMembersAccount==null){
            this.toMembersAccount=new ArrayList<>();
        }
        Collections.addAll(this.toMembersAccount,toMembersAccount);return this;
    }

    public SendGroupSystemNotification setContent(String content) {
        this.content = content;return this;
    }

    public String getGroupId() {
        return groupId;
    }

    public List<String> getToMembersAccount() {
        return toMembersAccount;
    }

    public String getContent() {
        return content;
    }
}
