package request.groupopenhttpsvc;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import model.MessageImport;
import request.GeneralModel;
import util.VariableUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Command("import_group_msg")
public class ImportGroupMsg extends GeneralModel {
    @JSONField(name="GroupId")
    private String groupId;
    @JSONField(name="MsgList")
    private List<MessageImport> msgList;

    public ImportGroupMsg(String serviceName) {
        super(serviceName);
    }

    public String getGroupId() {
        return groupId;
    }

    public ImportGroupMsg setGroupId(String groupId) {
        this.groupId = groupId;return this;
    }

    public List<MessageImport> getMsgList() {
        return msgList;
    }

    public ImportGroupMsg setMsgList(List<MessageImport> msgList) {
        this.msgList = msgList;return this;
    }
    public ImportGroupMsg setMsgList(MessageImport... msgList) {
        if (this.msgList==null){
            this.msgList=new ArrayList<>();
        }
        Collections.addAll(this.msgList,msgList);
        return this;
    }

    @Override
    public String checkParam() {
        if (VariableUtil.isEmpty(groupId)){
            return "GroupId";
        }
        if (VariableUtil.isEmpty(msgList)){
            return "MsgList";
        }
        return null;
    }
}
