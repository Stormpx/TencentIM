package request.groupopenhttpsvc;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import request.GeneralRequest;
import response.GroupMsgGetSimpleResponse;
import util.VariableUtil;

@Command("group_msg_get_simple")
public class GroupMsgGetSimpleRequest extends GeneralRequest<GroupMsgGetSimpleResponse> {
    @JSONField(name = "GroupId")
    private String groupId;
    @JSONField(name = "ReqMsgSeq")
    private Integer reqMsgSeq;
    @JSONField(name = "ReqMsgNumber")
    private Integer reqMsgNumber;
    public GroupMsgGetSimpleRequest(String serviceName) {
        super(serviceName);
    }

    @Override
    public String checkParam() {
        if (VariableUtil.isEmpty(groupId)){
            return "GroupId";
        }
        if (reqMsgNumber==null){
            return "ReqMsgNumber";
        }
        return null;
    }

    public String getGroupId() {
        return groupId;
    }

    public GroupMsgGetSimpleRequest setGroupId(String groupId) {
        this.groupId = groupId;return this;
    }

    public Integer getReqMsgSeq() {
        return reqMsgSeq;
    }

    public GroupMsgGetSimpleRequest setReqMsgSeq(Integer reqMsgSeq) {
        this.reqMsgSeq = reqMsgSeq;return this;
    }

    public Integer getReqMsgNumber() {
        return reqMsgNumber;
    }

    public GroupMsgGetSimpleRequest setReqMsgNumber(Integer reqMsgNumber) {
        this.reqMsgNumber = reqMsgNumber;return this;
    }
}
