package request.groupopenhttpsvc;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import request.GeneralModel;
import util.VariableUtil;

@Command("group_msg_get_simple")
public class GroupMsgGetSimple extends GeneralModel {
    @JSONField(name = "GroupId")
    private String groupId;
    @JSONField(name = "ReqMsgSeq")
    private Integer reqMsgSeq;
    @JSONField(name = "ReqMsgNumber")
    private Integer reqMsgNumber;
    public GroupMsgGetSimple(String serviceName) {
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

    public GroupMsgGetSimple setGroupId(String groupId) {
        this.groupId = groupId;return this;
    }

    public Integer getReqMsgSeq() {
        return reqMsgSeq;
    }

    public GroupMsgGetSimple setReqMsgSeq(Integer reqMsgSeq) {
        this.reqMsgSeq = reqMsgSeq;return this;
    }

    public Integer getReqMsgNumber() {
        return reqMsgNumber;
    }

    public GroupMsgGetSimple setReqMsgNumber(Integer reqMsgNumber) {
        this.reqMsgNumber = reqMsgNumber;return this;
    }
}
