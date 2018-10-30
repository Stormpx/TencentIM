package request.groupopenhttpsvc;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import model.MsgSeq;
import request.GeneralRequest;
import response.GroupMsgRecallResponse;
import util.VariableUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Command("group_msg_recall")
public class GroupMsgRecallRequest extends GeneralRequest<GroupMsgRecallResponse> {
    @JSONField(name = "GroupId")
    private String groupId;
    @JSONField(name = "MsgSeqList")
    private List<MsgSeq> msgSeqList;

    public GroupMsgRecallRequest(String serviceName) {
        super(serviceName);
    }

    public GroupMsgRecallRequest setGroupId(String groupId) {
        this.groupId = groupId;return this;
    }

    public GroupMsgRecallRequest setMsgSeqList(List<MsgSeq> msgSeqList) {
        this.msgSeqList = msgSeqList;return this;
    }
    public GroupMsgRecallRequest setMsgSeqList(MsgSeq... msgSeqList) {
        if (this.msgSeqList==null){
            this.msgSeqList=new ArrayList<>();
        }
        Collections.addAll(this.msgSeqList,msgSeqList);
        return this;
    }
    public GroupMsgRecallRequest setMsgSeqList(Integer... msgSeqList) {
        if (this.msgSeqList==null){
            this.msgSeqList=new ArrayList<>();
        }
        for (Integer i : msgSeqList) {
            this.msgSeqList.add(new MsgSeq(i));
        }
        return this;
    }

    @Override
    public String checkParam() {
        if (VariableUtil.isEmpty(groupId)){
            return "GroupId";
        }
        if (VariableUtil.isEmpty(msgSeqList)){
            return "MsgSeqList";
        }
        return null;
    }
}
