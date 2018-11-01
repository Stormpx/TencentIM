package request.openim.push;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import model.Condition;
import org.apache.commons.lang3.RandomUtils;
import request.GeneralRequest;
import model.msgbody.TIMMsgElement;
import response.ImPushResponse;
import util.VariableUtil;

import java.util.ArrayList;
import java.util.List;

@Command("im_push")
public class ImPushRequest extends GeneralRequest<ImPushResponse> {
    @JSONField(name = "Condition")
    private Condition condition;
    @JSONField(name = "MsgRandom")
    private Integer msgRandom=RandomUtils.nextInt();
    @JSONField(name = "MsgBody")
    private List<TIMMsgElement> msgBody;
    @JSONField(name = "MsgLifeTime")
    private Integer msgLifeTime;
    @JSONField(name = "From_Account")
    private String fromAccount;

    @Override
    public String checkParam() {
        if (VariableUtil.isEmpty(msgBody)){
            return "MsgBody";
        }

        return null;
    }

    public ImPushRequest setCondition(Condition condition) {
        this.condition = condition;return this;
    }

    public ImPushRequest setMsgRandom(Integer msgRandom) {
        this.msgRandom = msgRandom;return this;
    }

    public ImPushRequest setMsgBody(List<TIMMsgElement> msgBody) {
        this.msgBody = msgBody;return this;
    }
    public ImPushRequest setMsgBody(TIMMsgElement... msgBody) {
        if (this.msgBody ==null){
            this.msgBody=new ArrayList<>();
        }
        return this;
    }

    public ImPushRequest setMsgLifeTime(Integer msgLifeTime) {
        this.msgLifeTime = msgLifeTime;return this;
    }

    public ImPushRequest setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;return this;
    }

    public Condition getCondition() {
        return condition;
    }

    public Integer getMsgRandom() {
        return msgRandom;
    }

    public List<TIMMsgElement> getMsgBody() {
        return msgBody;
    }

    public Integer getMsgLifeTime() {
        return msgLifeTime;
    }

    public String getFromAccount() {
        return fromAccount;
    }
}
