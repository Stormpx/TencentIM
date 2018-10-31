package response;

public class SendGroupSystemNotificationResponse extends GeneralResponse {
    private Integer MsgSeq;

    public Integer getMsgSeq() {
        return MsgSeq;
    }

    public void setMsgSeq(Integer msgSeq) {
        MsgSeq = msgSeq;
    }
}
