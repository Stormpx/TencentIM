package request.msgbody;

import com.alibaba.fastjson.annotation.JSONField;

public class TIMMsgElement {
    @JSONField(name = "MsgType")
    private String MsgType;
    @JSONField(name = "MsgContent")
    private Element MsgContent;


    public String getMsgType() {
        return MsgType;
    }

    public TIMMsgElement setMsgType(String msgType) {
        MsgType = msgType;return this;
    }

    public Element getMsgContent() {
        return MsgContent;
    }

    public TIMMsgElement setMsgContent(Element msgContent) {
        MsgContent = msgContent;return this;
    }
}
