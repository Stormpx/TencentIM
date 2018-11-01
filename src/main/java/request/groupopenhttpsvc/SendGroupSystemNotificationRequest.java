package request.groupopenhttpsvc;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import request.GeneralRequest;
import response.GeneralResponse;
import response.SendGroupSystemNotificationResponse;
import util.VariableUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Command("send_group_system_notification")
public class SendGroupSystemNotificationRequest extends GeneralRequest<SendGroupSystemNotificationResponse> {
    @JSONField(name = "GroupId")
    private String groupId;
    @JSONField(name = "ToMembers_Account")
    private List<String> toMembersAccount;
    @JSONField(name = "Content")
    private String content;

    @Override
    protected String checkParam() {
        if (VariableUtil.isEmpty(groupId)){
            return "GroupId";
        }
        if (VariableUtil.isEmpty(content)){
            return "Content";
        }
        return null;
    }

    public SendGroupSystemNotificationRequest setGroupId(String groupId) {
        this.groupId = groupId;return this;
    }

    public SendGroupSystemNotificationRequest setToMembersAccount(List<String> toMembersAccount) {
        this.toMembersAccount = toMembersAccount;return this;
    }
    public SendGroupSystemNotificationRequest setToMembersAccount(String... toMembersAccount) {
        if (this.toMembersAccount==null){
            this.toMembersAccount=new ArrayList<>();
        }
        Collections.addAll(this.toMembersAccount,toMembersAccount);return this;
    }

    public SendGroupSystemNotificationRequest setContent(String content) {
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
