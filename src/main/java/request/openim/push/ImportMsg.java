package request.openim.push;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import request.GeneralModel;
import request.msgbody.TIMMsgElement;

import java.util.List;
@Command("importmsg")
public class ImportMsg extends GeneralModel {
    @JSONField(name = "SyncFromOldSystem")
    private Integer syncOtherMachine;
    @JSONField(name = "From_Account")
    private String fromAccount;
    @JSONField(name = "To_Account")
    private String toAccount;
    @JSONField(name = "MsgRandom")
    private Integer msgRandom= RandomUtils.nextInt();
    @JSONField(name = "MsgTimeStamp")
    private Integer msgTimeStamp;
    @JSONField(name = "MsgBody")
    private List<TIMMsgElement> msgBody;

    public ImportMsg(String serviceName) {
        super(serviceName);
    }

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
        return null;
    }

    public Integer getSyncOtherMachine() {
        return syncOtherMachine;
    }

    public ImportMsg setSyncOtherMachine(Integer syncOtherMachine) {
        this.syncOtherMachine = syncOtherMachine;return this;
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public ImportMsg setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;return this;
    }

    public String getToAccount() {
        return toAccount;
    }

    public ImportMsg setToAccount(String toAccount) {
        this.toAccount = toAccount;return this;
    }

    public Integer getMsgRandom() {
        return msgRandom;
    }

    public ImportMsg setMsgRandom(Integer msgRandom) {
        this.msgRandom = msgRandom;return this;
    }

    public Integer getMsgTimeStamp() {
        return msgTimeStamp;
    }

    public ImportMsg setMsgTimeStamp(Integer msgTimeStamp) {
        this.msgTimeStamp = msgTimeStamp;return this;
    }

    public List<TIMMsgElement> getMsgBody() {
        return msgBody;
    }

    public ImportMsg setMsgBody(List<TIMMsgElement> msgBody) {
        this.msgBody = msgBody;return this;
    }
}
