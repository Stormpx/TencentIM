package request.openim.push;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import request.GeneralRequest;
import model.msgbody.TIMMsgElement;
import response.GeneralResponse;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
@Command("importmsg")
public class ImportMsgRequest extends GeneralRequest<GeneralResponse> {
    @JSONField(name = "SyncFromOldSystem")
    private Integer syncOtherMachine;
    @JSONField(name = "From_Account")
    private String fromAccount;
    @JSONField(name = "To_Account")
    private String toAccount;
    @JSONField(name = "MsgRandom")
    private Integer msgRandom= RandomUtils.nextInt();
    @JSONField(name = "MsgTimeStamp")
    private Long msgTimeStamp;
    @JSONField(name = "MsgBody")
    private List<TIMMsgElement> msgBody;


    @Override
    public String checkParam() {
        if (syncOtherMachine==null){
            return "SyncFromOldSystem";
        }
        if (StringUtils.isEmpty(fromAccount)){
            return "fromAccount";
        }
        if (StringUtils.isEmpty(toAccount)){
            return "To_Account";
        }
        if (msgBody==null||msgBody.isEmpty()){
            return "MsgBody";
        }
        if (syncOtherMachine>2||syncOtherMachine<1){
            return getNonSupport("SyncFromOldSystem",syncOtherMachine+"");
        }
        return null;
    }

    public Integer getSyncOtherMachine() {
        return syncOtherMachine;
    }

    public ImportMsgRequest setSyncOtherMachine(Integer syncOtherMachine) {
        this.syncOtherMachine = syncOtherMachine;return this;
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public ImportMsgRequest setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;return this;
    }

    public String getToAccount() {
        return toAccount;
    }

    public ImportMsgRequest setToAccount(String toAccount) {
        this.toAccount = toAccount;return this;
    }

    public Integer getMsgRandom() {
        return msgRandom;
    }

    public ImportMsgRequest setMsgRandom(Integer msgRandom) {
        this.msgRandom = msgRandom;return this;
    }

    public Long getMsgTimeStamp() {
        return msgTimeStamp;
    }

    public ImportMsgRequest setMsgTimeStamp(Long msgTimeStamp) {
        this.msgTimeStamp = msgTimeStamp;return this;
    }

    public List<TIMMsgElement> getMsgBody() {
        return msgBody;
    }

    public ImportMsgRequest setMsgBody(List<TIMMsgElement> msgBody) {
        this.msgBody = msgBody;return this;
    }
    public ImportMsgRequest setMsgBody(TIMMsgElement... msgBody) {
        if (this.msgBody==null){
            this.msgBody=new LinkedList<>();
        }
        Collections.addAll(this.msgBody,msgBody);
        return this;
    }
}
