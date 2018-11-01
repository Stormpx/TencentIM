package request.groupopenhttpsvc;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import request.GeneralRequest;
import response.GeneralResponse;
import util.VariableUtil;

@Command("delete_group_msg_by_sender")
public class DeleteGroupMsgBySenderRequest extends GeneralRequest<GeneralResponse> {
    @JSONField(name = "GroupId")
    private String groupId;
    @JSONField(name = "Sender_Account")
    private String senderAccount;

    @Override
    protected String checkParam() {
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

    public DeleteGroupMsgBySenderRequest setGroupId(String groupId) {
        this.groupId = groupId;return this;
    }

    public String getSenderAccount() {
        return senderAccount;
    }

    public DeleteGroupMsgBySenderRequest setSenderAccount(String senderAccount) {
        this.senderAccount = senderAccount;return this;
    }
}
