package request.openim.msg;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import request.GeneralModel;
import request.msgbody.OfflinePushInfo;
import request.msgbody.TIMMsgElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@Command("sendmsg")
public class SendMsg extends GeneralModel {
    @JSONField(name = "SyncOtherMachine")
    private Integer syncOtherMachine;
    @JSONField(name = "From_Account")
    private String from_Account;
    @JSONField(name = "To_Account")
    private String to_Account;
    @JSONField(name = "MsgLifeTime")
    private Integer msgLifeTime;
    @JSONField(name = "MsgRandom")
    private Integer msgRandom= RandomUtils.nextInt();
    @JSONField(name = "MsgTimeStamp")
    private Integer msgTimeStamp;
    @JSONField(name = "MsgBody")
    private List<TIMMsgElement> msgBody;
    @JSONField(name = "OfflinePushInfo")
    private OfflinePushInfo offlinePushInfo;
    public SendMsg(String serviceName) {
        super(serviceName);
    }

    @Override
    public String checkParam() {
        if (StringUtils.isEmpty(to_Account)){
            return "To_Account";
        }
        if (msgBody==null||msgBody.isEmpty()){
            return "MsgBody";
        }
        return null;
    }

    public Integer getSyncOtherMachine() {
        return syncOtherMachine;
    }

    public SendMsg setSyncOtherMachine(Integer syncOtherMachine) {
        this.syncOtherMachine = syncOtherMachine;return this;
    }

    public String getFrom_Account() {
        return from_Account;
    }

    public SendMsg setFrom_Account(String from_Account) {
        this.from_Account = from_Account;return this;
    }

    public String getTo_Account() {
        return to_Account;
    }

    public SendMsg setTo_Account(String to_Account) {
        this.to_Account = to_Account;return this;
    }

    public Integer getMsgLifeTime() {
        return msgLifeTime;
    }

    public SendMsg setMsgLifeTime(Integer msgLifeTime) {
        this.msgLifeTime = msgLifeTime;return this;
    }

    public Integer getMsgRandom() {
        return msgRandom;
    }

    public SendMsg setMsgRandom(Integer msgRandom) {
        this.msgRandom = msgRandom;return this;
    }

    public Integer getMsgTimeStamp() {
        return msgTimeStamp;
    }

    public SendMsg setMsgTimeStamp(Integer msgTimeStamp) {
        this.msgTimeStamp = msgTimeStamp;return this;
    }

    public List<TIMMsgElement> getMsgBody() {
        return msgBody;
    }

    public SendMsg setMsgBody(List<TIMMsgElement> msgBody) {
        this.msgBody = msgBody;return this;
    }
    public SendMsg setMsgBody(TIMMsgElement... msgBody) {
        if (this.msgBody==null){
            this.msgBody=new ArrayList<>();
        }
        Collections.addAll(this.msgBody,msgBody);
        return this;
    }
    public OfflinePushInfo getOfflinePushInfo() {
        return offlinePushInfo;
    }

    public SendMsg setOfflinePushInfo(OfflinePushInfo offlinePushInfo) {
        this.offlinePushInfo = offlinePushInfo;return this;
    }
}
