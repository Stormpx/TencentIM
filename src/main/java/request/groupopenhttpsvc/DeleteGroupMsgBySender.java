package request.groupopenhttpsvc;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import request.GeneralModel;
import util.VariableUtil;

@Command("delete_group_msg_by_sender")
public class DeleteGroupMsgBySender extends GeneralModel {
    @JSONField(name = "GroupId")
    private String groupId;
    @JSONField(name = "Sender_Account")
    private String senderAccount;
    public DeleteGroupMsgBySender(String serviceName) {
        super(serviceName);
    }

    @Override
    public String checkParam() {
        if (VariableUtil.isEmpty(groupId)){
            return "GroupId";
        }
        if (VariableUtil.isEmpty(senderAccount)){
            return "Sender_Account";
        }
        return null;
    }

    public String getGroupId() {
        return groupId;
    }

    public DeleteGroupMsgBySender setGroupId(String groupId) {
        this.groupId = groupId;return this;
    }

    public String getSenderAccount() {
        return senderAccount;
    }

    public DeleteGroupMsgBySender setSenderAccount(String senderAccount) {
        this.senderAccount = senderAccount;return this;
    }
}
