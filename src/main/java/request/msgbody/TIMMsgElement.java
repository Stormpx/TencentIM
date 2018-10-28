package request.msgbody;

import com.alibaba.fastjson.annotation.JSONField;

public class TIMMsgElement {
    @JSONField(name = "MsgType")
    private String msgType;
    @JSONField(name = "MsgContent")
    private Element msgContent;


    public String getMsgType() {
        return msgType;
    }

    public TIMMsgElement setMsgType(String msgType) {
        this.msgType = msgType;return this;
    }

    public Object getMsgContent() {
        return msgContent;
    }

    public TIMMsgElement setMsgContent(Element msgContent) {
        this.msgContent = msgContent;return this;
    }
}
