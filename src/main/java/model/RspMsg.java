package model;

import request.msgbody.TIMMsgElement;

import java.util.List;

public class RspMsg {
    private String From_Account;
    private Integer IsPlaceMsg;
    private Integer MsgRandom;
    private Integer MsgSeq;
    private Long  MsgTimeStamp;
    private List<TIMMsgElement> MsgBody;

    public String getFrom_Account() {
        return From_Account;
    }

    public void setFrom_Account(String from_Account) {
        From_Account = from_Account;
    }

    public Integer getIsPlaceMsg() {
        return IsPlaceMsg;
    }

    public void setIsPlaceMsg(Integer isPlaceMsg) {
        IsPlaceMsg = isPlaceMsg;
    }

    public Integer getMsgRandom() {
        return MsgRandom;
    }

    public void setMsgRandom(Integer msgRandom) {
        MsgRandom = msgRandom;
    }

    public Integer getMsgSeq() {
        return MsgSeq;
    }

    public void setMsgSeq(Integer msgSeq) {
        MsgSeq = msgSeq;
    }

    public Long getMsgTimeStamp() {
        return MsgTimeStamp;
    }

    public void setMsgTimeStamp(Long msgTimeStamp) {
        MsgTimeStamp = msgTimeStamp;
    }

    public List<TIMMsgElement> getMsgBody() {
        return MsgBody;
    }

    public void setMsgBody(List<TIMMsgElement> msgBody) {
        MsgBody = msgBody;
    }
}
