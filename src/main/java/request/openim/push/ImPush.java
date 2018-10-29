package request.openim.push;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import model.Condition;
import org.apache.commons.lang3.RandomUtils;
import request.GeneralModel;
import request.msgbody.TIMMsgElement;
import util.VariableUtil;

import java.util.ArrayList;
import java.util.List;

@Command("im_push")
public class ImPush extends GeneralModel{
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
    public ImPush(String serviceName) {
        super(serviceName);
    }

    @Override
    public String checkParam() {
        if (VariableUtil.isEmpty(msgBody)){
            return "MsgBody";
        }

        return null;
    }

    public ImPush setCondition(Condition condition) {
        this.condition = condition;return this;
    }

    public ImPush setMsgRandom(Integer msgRandom) {
        this.msgRandom = msgRandom;return this;
    }

    public ImPush setMsgBody(List<TIMMsgElement> msgBody) {
        this.msgBody = msgBody;return this;
    }
    public ImPush setMsgBody(TIMMsgElement... msgBody) {
        if (this.msgBody ==null){
            this.msgBody=new ArrayList<>();
        }
        return this;
    }

    public ImPush setMsgLifeTime(Integer msgLifeTime) {
        this.msgLifeTime = msgLifeTime;return this;
    }

    public ImPush setFromAccount(String fromAccount) {
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
