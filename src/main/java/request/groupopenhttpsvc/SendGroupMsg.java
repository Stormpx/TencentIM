package request.groupopenhttpsvc;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import org.apache.commons.lang3.RandomUtils;
import request.GeneralModel;
import request.msgbody.OfflinePushInfo;
import request.msgbody.TIMMsgElement;
import request.openim.msg.SendMsg;
import util.VariableUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Command("send_group_msg")
public class SendGroupMsg extends GeneralModel {
    @JSONField(name = "GroupId")
    private String groupId;
    @JSONField(name = "MsgRandom")
    private Integer msgRandom= RandomUtils.nextInt();
    @JSONField(name = "MsgPriority")
    private String msgPriority;
    @JSONField(name = "From_Account")
    private String fromAccount;
    @JSONField(name = "MsgBody")
    private List<TIMMsgElement> msgBody;
    @JSONField(name = "OfflinePushInfo")
    private OfflinePushInfo offlinePushInfo;
    @JSONField(name = "ForbidCallbackControl")
    private List<String> forbidCallbackControl;
    public SendGroupMsg(String serviceName) {
        super(serviceName);
    }

    @Override
    public String checkParam() {
        if (VariableUtil.isEmpty(groupId)){
            return "GroupId";
        }
        if (VariableUtil.isEmpty(msgBody)){
            return "MsgBody";
        }

        return null;
    }

    public SendGroupMsg setGroupId(String groupId) {
        this.groupId = groupId;return this;
    }

    public SendGroupMsg setMsgRandom(Integer msgRandom) {
        this.msgRandom = msgRandom;
        return this;
    }

    public SendGroupMsg setMsgPriority(String msgPriority) {
        this.msgPriority = msgPriority;
        return this;
    }

    public SendGroupMsg setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
        return this;
    }

    public SendGroupMsg setMsgBody(List<TIMMsgElement> msgBody) {
        this.msgBody = msgBody;
        return this;
    }
    public SendGroupMsg setMsgBody(TIMMsgElement... msgBody) {
        if (this.msgBody==null){
            this.msgBody=new ArrayList<>();
        }
        Collections.addAll(this.msgBody,msgBody);
        return this;
    }
    public SendGroupMsg setOfflinePushInfo(OfflinePushInfo offlinePushInfo) {
        this.offlinePushInfo = offlinePushInfo;
        return this;
    }

    public SendGroupMsg setForbidCallbackControl(List<String> forbidCallbackControl) {
        this.forbidCallbackControl = forbidCallbackControl;
        return this;
    }
    public SendGroupMsg setForbidCallbackControl(String... forbidCallbackControl) {
        if (this.forbidCallbackControl==null){
            this.forbidCallbackControl=new ArrayList<>();
        }
        Collections.addAll(this.forbidCallbackControl,forbidCallbackControl);
        return this;
    }

    public String getGroupId() {
        return groupId;
    }

    public Integer getMsgRandom() {
        return msgRandom;
    }

    public String getMsgPriority() {
        return msgPriority;
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public List<TIMMsgElement> getMsgBody() {
        return msgBody;
    }

    public OfflinePushInfo getOfflinePushInfo() {
        return offlinePushInfo;
    }

    public List<String> getForbidCallbackControl() {
        return forbidCallbackControl;
    }
}
