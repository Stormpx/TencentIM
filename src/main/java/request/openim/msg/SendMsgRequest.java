package request.openim.msg;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import request.GeneralRequest;
import model.msgbody.OfflinePushInfo;
import model.msgbody.TIMMsgElement;
import response.GeneralResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@Command("sendmsg")
public class SendMsgRequest extends GeneralRequest<GeneralResponse> {
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

    public SendMsgRequest setSyncOtherMachine(Integer syncOtherMachine) {
        this.syncOtherMachine = syncOtherMachine;return this;
    }

    public String getFrom_Account() {
        return from_Account;
    }

    public SendMsgRequest setFrom_Account(String from_Account) {
        this.from_Account = from_Account;return this;
    }

    public String getTo_Account() {
        return to_Account;
    }

    public SendMsgRequest setTo_Account(String to_Account) {
        this.to_Account = to_Account;return this;
    }

    public Integer getMsgLifeTime() {
        return msgLifeTime;
    }

    public SendMsgRequest setMsgLifeTime(Integer msgLifeTime) {
        this.msgLifeTime = msgLifeTime;return this;
    }

    public Integer getMsgRandom() {
        return msgRandom;
    }

    public SendMsgRequest setMsgRandom(Integer msgRandom) {
        this.msgRandom = msgRandom;return this;
    }

    public Integer getMsgTimeStamp() {
        return msgTimeStamp;
    }

    public SendMsgRequest setMsgTimeStamp(Integer msgTimeStamp) {
        this.msgTimeStamp = msgTimeStamp;return this;
    }

    public List<TIMMsgElement> getMsgBody() {
        return msgBody;
    }

    public SendMsgRequest setMsgBody(List<TIMMsgElement> msgBody) {
        this.msgBody = msgBody;return this;
    }
    public SendMsgRequest setMsgBody(TIMMsgElement... msgBody) {
        if (this.msgBody==null){
            this.msgBody=new ArrayList<>();
        }
        Collections.addAll(this.msgBody,msgBody);
        return this;
    }
    public OfflinePushInfo getOfflinePushInfo() {
        return offlinePushInfo;
    }

    public SendMsgRequest setOfflinePushInfo(OfflinePushInfo offlinePushInfo) {
        this.offlinePushInfo = offlinePushInfo;return this;
    }
}
