package request.groupopenhttpsvc;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import request.GeneralModel;
import util.VariableUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Command("forbid_send_msg")
public class ForbidSendMsg extends GeneralModel {
    @JSONField(name = "GroupId")
    private String groupId;
    @JSONField(name = "User_Account")
    private List<String> userAccount;
    @JSONField(name = "ShutUpTime")
    private Integer shutUpTime;

    public ForbidSendMsg(String serviceName) {
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
    public ForbidSendMsg setGroupId(String groupId) {
        this.groupId = groupId;return this;
    }

    public ForbidSendMsg setUserAccount(List<String> userAccount) {
        this.userAccount = userAccount;return this;
    }

    public ForbidSendMsg setUserAccount(String... userAccount) {
        if (this.userAccount==null){
            this.userAccount=new ArrayList<>();
        }
        Collections.addAll(this.userAccount,userAccount);
        return this;
    }

    public Integer getShutUpTime() {
        return shutUpTime;
    }

    public ForbidSendMsg setShutUpTime(Integer shutUpTime) {
        this.shutUpTime = shutUpTime;return this;
    }

    public String getGroupId() {
        return groupId;
    }

    public List<String> getUserAccount() {
        return userAccount;
    }
}
