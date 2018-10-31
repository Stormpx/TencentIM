package request.openmsgsvc;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import request.GeneralRequest;
import response.GetHistoryResponse;
import util.VariableUtil;

@Command("get_history")
public class GetHistoryRequest extends GeneralRequest<GetHistoryResponse> {
    //C2C:单发消息 Group:群组消息
    @JSONField(name = "ChatType")
    private String chatType;
    //2015120121 表示获取 2015 年 12 月 1 日 21:00~21:59 的消息的下载地址
    @JSONField(name = "MsgTime")
    private String msgTime;
    public GetHistoryRequest(String serviceName) {
        super(serviceName);
    }

    @Override
    protected String checkParam() {
        if (VariableUtil.isEmpty(chatType)){
            return "ChatType";
        }
        if (VariableUtil.isEmpty(msgTime)){
            return "MsgTime";
        }
        return null;
    }

    public String getChatType() {
        return chatType;
    }

    public GetHistoryRequest setChatType(String chatType) {
        this.chatType = chatType;return this;
    }

    public String getMsgTime() {
        return msgTime;
    }

    public GetHistoryRequest setMsgTime(String msgTime) {
        this.msgTime = msgTime;return this;
    }
}
