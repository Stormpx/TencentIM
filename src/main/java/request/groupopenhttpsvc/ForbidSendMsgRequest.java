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
    @JSONField(name = "User_Account")
    private List<String> userAccount;
    @JSONField(name = "ShutUpTime")
    private Integer shutUpTime;

    public ForbidSendMsgRequest(String serviceName) {
        super(serviceName);
    }

    @Override
    public String checkParam() {
        if (VariableUtil.isEmpty(groupId)){
            return "GroupId";
        }
        if (VariableUtil.isEmpty(userAccount)){
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

    public ForbidSendMsgRequest setUserAccount(List<String> userAccount) {
        this.userAccount = userAccount;return this;
    }

    public ForbidSendMsgRequest setUserAccount(String... userAccount) {
        if (this.userAccount==null){
            this.userAccount=new ArrayList<>();
        }
        Collections.addAll(this.userAccount,userAccount);
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

    public List<String> getUserAccount() {
        return userAccount;
    }
}
