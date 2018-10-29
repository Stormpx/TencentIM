package model;

import com.alibaba.fastjson.annotation.JSONField;

public class MsgSeq {
    @JSONField(name = "MsgSeq")
    private Integer msgSeq;

    public MsgSeq() {
    }

    public MsgSeq(Integer msgSeq) {
        this.msgSeq = msgSeq;
    }

    public Integer getMsgSeq() {
        return msgSeq;
    }

    public MsgSeq setMsgSeq(Integer msgSeq) {
        this.msgSeq = msgSeq;return this;
    }
}
