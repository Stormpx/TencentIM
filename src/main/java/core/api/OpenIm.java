package core.api;

import annotation.ServiceName;
import core.enhance.Academy;
import request.openim.line.QueryState;
import request.openim.msg.BatchSendMsg;
import request.openim.push.*;
import request.openim.msg.SendMsg;

@ServiceName("openim")
public class OpenIm {
    private final static String serviceName = "openim";

    public SendMsg sendMsgPrepare() {
        return (SendMsg) Academy.requestEnhance(new SendMsg(serviceName));
    }

    public BatchSendMsg batchSendMsgPrepare() {
        return (BatchSendMsg) Academy.requestEnhance(new BatchSendMsg(serviceName));
    }

    public ImportMsg importMsgPrepare() {
        return (ImportMsg) Academy.requestEnhance(new ImportMsg(serviceName));
    }

    public ImGetPushReport imGetPushReportPrepare() {
        return (ImGetPushReport) Academy.requestEnhance(new ImGetPushReport(serviceName));
    }

    public ImSetAttrName imSetAttrNamePrepare() {
        return (ImSetAttrName) Academy.requestEnhance(new ImSetAttrName(serviceName));
    }

    public ImGetAttrName imGetAttrNamePrepare() {
        return (ImGetAttrName) Academy.requestEnhance(new ImGetAttrName(serviceName));
    }

    public ImSetAttr imSetAttrPrepare() {
        return (ImSetAttr) Academy.requestEnhance(new ImSetAttr(serviceName));
    }
    public ImRemoveAttr imRemoveAttrPrepare(){return (ImRemoveAttr)Academy.requestEnhance(new ImRemoveAttr(serviceName));}
    public ImGetAttr imGetAttrPrepare(){
        return (ImGetAttr) Academy.requestEnhance(new ImGetAttr(serviceName));
    }
    public ImAddTag imAddTagPrepare(){
        return (ImAddTag) Academy.requestEnhance(new ImAddTag(serviceName));
    }
    public ImGetTag imGetTagPrepare(){
        return (ImGetTag) Academy.requestEnhance(new ImGetTag(serviceName));
    }
    public ImRemoveTag imRemoveTagPrepare(){
        return (ImRemoveTag) Academy.requestEnhance(new ImRemoveTag(serviceName));
    }
    public ImRemoveAllTags imRemoveAllTagsPrepare(){
        return (ImRemoveAllTags) Academy.requestEnhance(new ImRemoveAllTags(serviceName));
    }
    public QueryState queryStatePrepare(){
        return (QueryState) Academy.requestEnhance(new QueryState(serviceName));
    }
}
