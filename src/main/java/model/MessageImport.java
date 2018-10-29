package model;

import com.alibaba.fastjson.annotation.JSONField;
import request.msgbody.TIMMsgElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MessageImport {
    @JSONField(name = "From_Account")
    private String fromAccount;
    @JSONField(name = "SendTime")
    private String sendTime;
    @JSONField(name = "Random")
    private String random;
    @JSONField(name = "MsgBody")
    private List<TIMMsgElement> msgBody;

    public List<TIMMsgElement> getMsgBody() {
        return msgBody;
    }

    public MessageImport setMsgBody(List<TIMMsgElement> msgBody) {
        this.msgBody = msgBody;
        return this;
    }

    public MessageImport setMsgBody(TIMMsgElement... msgBody) {
        if (this.msgBody == null) {
            this.msgBody = new ArrayList<>();
        }
        Collections.addAll(this.msgBody, msgBody);
        return this;
    }

    public MessageImport setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;return this;
    }

    public MessageImport setSendTime(String sendTime) {
        this.sendTime = sendTime;return this;
    }

    public MessageImport setRandom(String random) {
        this.random = random;return this;
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public String getSendTime() {
        return sendTime;
    }

    public String getRandom() {
        return random;
    }
}
