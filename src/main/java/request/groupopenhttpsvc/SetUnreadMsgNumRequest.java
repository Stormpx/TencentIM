package request.groupopenhttpsvc;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import request.GeneralRequest;
import response.GeneralResponse;
import util.VariableUtil;

@Command("set_unread_msg_num")
public class SetUnreadMsgNumRequest extends GeneralRequest<GeneralResponse> {
    @JSONField(name = "GroupId")
    private String groupId;
    @JSONField(name = "Member_Account")
    private String memberAccount;
    @JSONField(name = "UnreadMsgNum")
    private Integer unreadMsgNum;

    @Override
    public String checkParam() {
        if (VariableUtil.isEmpty(groupId)){
            return "GroupId";
        }
        if (VariableUtil.isEmpty(memberAccount)){
            return "Member_Account";
        }
        if (unreadMsgNum==null){
            return "UnreadMsgNum";
        }
        return null;
    }

    public String getGroupId() {
        return groupId;
    }

    public SetUnreadMsgNumRequest setGroupId(String groupId) {
        this.groupId = groupId;return this;
    }

    public String getMemberAccount() {
        return memberAccount;
    }

    public SetUnreadMsgNumRequest setMemberAccount(String memberAccount) {
        this.memberAccount = memberAccount;return this;
    }

    public Integer getUnreadMsgNum() {
        return unreadMsgNum;
    }

    public SetUnreadMsgNumRequest setUnreadMsgNum(Integer unreadMsgNum) {
        this.unreadMsgNum = unreadMsgNum;return this;
    }
}
