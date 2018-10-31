package request.openim.msg;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import org.apache.commons.lang3.RandomUtils;
import request.GeneralRequest;
import model.msgbody.OfflinePushInfo;
import model.msgbody.TIMMsgElement;
import response.BatchSendMsgResponse;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
@Command("batchsendmsg")
public class BatchSendMsgRequest extends GeneralRequest<BatchSendMsgResponse> {
    @JSONField(name = "SyncOtherMachine")
    private Integer syncOtherMachine;
    @JSONField(name = "From_Account")
    private String from_Account;
    @JSONField(name = "To_Account")
    private List<String> to_Account;
    @JSONField(name = "MsgRandom")
    private Integer msgRandom= RandomUtils.nextInt();
    @JSONField(name = "MsgBody")
    private List<TIMMsgElement> msgBody;
    @JSONField(name = "OfflinePushInfo")
    private OfflinePushInfo offlinePushInfo;

    public BatchSendMsgRequest(String serviceName) {
        super(serviceName);
    }

    @Override
    public String checkParam() {
        if (to_Account==null||to_Account.isEmpty()){
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

    public BatchSendMsgRequest setSyncOtherMachine(Integer syncOtherMachine) {
        this.syncOtherMachine = syncOtherMachine;return this;
    }

    public String getFrom_Account() {
        return from_Account;
    }

    public BatchSendMsgRequest setFrom_Account(String from_Account) {
        this.from_Account = from_Account;return this;
    }

    public List<String> getTo_Account() {
        return to_Account;
    }

    public BatchSendMsgRequest setTo_Account(List<String> to_Account) {
        this.to_Account = to_Account;return this;
    }
    public BatchSendMsgRequest setTo_Account(String... to_Account) {
        if (this.to_Account==null){
            this.to_Account=new LinkedList<>();
        }
        Collections.addAll(this.to_Account,to_Account);
        return this;
    }

    public Integer getMsgRandom() {
        return msgRandom;
    }

    public BatchSendMsgRequest setMsgRandom(Integer msgRandom) {
        this.msgRandom = msgRandom;return this;
    }

    public List<TIMMsgElement> getMsgBody() {
        return msgBody;
    }

    public BatchSendMsgRequest setMsgBody(List<TIMMsgElement> msgBody) {
        this.msgBody = msgBody;return this;
    }
    public BatchSendMsgRequest setMsgBody(TIMMsgElement... msgBody) {
        if (this.msgBody==null){
            this.msgBody=new LinkedList<>();
        }
        Collections.addAll(this.msgBody,msgBody);
        return this;
    }

    public OfflinePushInfo getOfflinePushInfo() {
        return offlinePushInfo;
    }

    public BatchSendMsgRequest setOfflinePushInfo(OfflinePushInfo offlinePushInfo) {
        this.offlinePushInfo = offlinePushInfo;return this;
    }
}
