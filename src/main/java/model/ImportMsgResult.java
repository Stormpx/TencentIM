package model;

public class ImportMsgResult {
    private Integer Result;
    private Integer MsgSeq;
    private Long MsgTime;

    public Integer getResult() {
        return Result;
    }

    public void setResult(Integer result) {
        Result = result;
    }

    public Integer getMsgSeq() {
        return MsgSeq;
    }

    public void setMsgSeq(Integer msgSeq) {
        MsgSeq = msgSeq;
    }

    public Long getMsgTime() {
        return MsgTime;
    }

    public void setMsgTime(Long msgTime) {
        MsgTime = msgTime;
    }
}
