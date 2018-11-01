package request.groupopenhttpsvc;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import request.GeneralRequest;
import response.GeneralResponse;
import util.VariableUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Command("forbid_send_msg")
public class ForbidSendMsgRequest extends GeneralRequest<GeneralResponse> {
    @JSONField(name = "GroupId")
    private String groupId;
    @JSONField(name = "Members_Account")
    private List<String> memberAccount;
    @JSONField(name = "ShutUpTime")
    private Integer shutUpTime;


    @Override
    protected String checkParam() {
        if (VariableUtil.isEmpty(groupId)){
            return "GroupId";
        }
        if (VariableUtil.isEmpty(memberAccount)){
            return "User_Account";
        }
        if (shutUpTime==null){
            return "ShutUpTime";
        }
        return null;
    }
    public ForbidSendMsgRequest setGroupId(String groupId) {
        this.groupId = groupId;return this;
    }

    public ForbidSendMsgRequest setMemberAccount(List<String> memberAccount) {
        this.memberAccount = memberAccount;return this;
    }

    public ForbidSendMsgRequest setMemberAccount(String... userAccount) {
        if (this.memberAccount ==null){
            this.memberAccount =new ArrayList<>();
        }
        Collections.addAll(this.memberAccount,userAccount);
        return this;
    }

    public Integer getShutUpTime() {
        return shutUpTime;
    }

    public ForbidSendMsgRequest setShutUpTime(Integer shutUpTime) {
        this.shutUpTime = shutUpTime;return this;
    }

    public String getGroupId() {
        return groupId;
    }

    public List<String> getMemberAccount() {
        return memberAccount;
    }
}
