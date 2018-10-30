package response;

public class SendGroupMsgResponse extends GeneralResponse{
    private Long MsgTime;
    private Integer MsgSeq;

    public Long getMsgTime() {
        return MsgTime;
    }

    public void setMsgTime(Long msgTime) {
        MsgTime = msgTime;
    }

    public Integer getMsgSeq() {
        return MsgSeq;
    }

    public void setMsgSeq(Integer msgSeq) {
        MsgSeq = msgSeq;
    }
}
