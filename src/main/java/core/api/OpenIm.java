package core.api;

import annotation.ServiceName;
import core.enhance.Academy;
import request.openim.line.QueryStateRequest;
import request.openim.msg.BatchSendMsgRequest;
import request.openim.push.*;
import request.openim.msg.SendMsgRequest;

@ServiceName("openim")
public class OpenIm {
    private final static String serviceName = "openim";

    public SendMsgRequest sendMsgPrepare() {
        return (SendMsgRequest) Academy.requestEnhance(new SendMsgRequest(serviceName));
    }

    public BatchSendMsgRequest batchSendMsgPrepare() {
        return (BatchSendMsgRequest) Academy.requestEnhance(new BatchSendMsgRequest(serviceName));
    }

    public ImportMsgRequest importMsgPrepare() {
        return (ImportMsgRequest) Academy.requestEnhance(new ImportMsgRequest(serviceName));
    }

    public ImPushRequest imPushPrepare(){
        return (ImPushRequest) Academy.requestEnhance(new ImPushRequest(serviceName));
    }
    public ImGetPushReportRequest imGetPushReportPrepare() {
        return (ImGetPushReportRequest) Academy.requestEnhance(new ImGetPushReportRequest(serviceName));
    }

    public ImSetAttrNameRequest imSetAttrNamePrepare() {
        return (ImSetAttrNameRequest) Academy.requestEnhance(new ImSetAttrNameRequest(serviceName));
    }

    public ImGetAttrNameRequest imGetAttrNamePrepare() {
        return (ImGetAttrNameRequest) Academy.requestEnhance(new ImGetAttrNameRequest(serviceName));
    }

    public ImSetAttrRequest imSetAttrPrepare() {
        return (ImSetAttrRequest) Academy.requestEnhance(new ImSetAttrRequest(serviceName));
    }
    public ImRemoveAttrRequest imRemoveAttrPrepare(){return (ImRemoveAttrRequest)Academy.requestEnhance(new ImRemoveAttrRequest(serviceName));}
    public ImGetAttrRequest imGetAttrPrepare(){
        return (ImGetAttrRequest) Academy.requestEnhance(new ImGetAttrRequest(serviceName));
    }
    public ImAddTagRequest imAddTagPrepare(){
        return (ImAddTagRequest) Academy.requestEnhance(new ImAddTagRequest(serviceName));
    }
    public ImGetTagRequest imGetTagPrepare(){
        return (ImGetTagRequest) Academy.requestEnhance(new ImGetTagRequest(serviceName));
    }
    public ImRemoveTagRequest imRemoveTagPrepare(){
        return (ImRemoveTagRequest) Academy.requestEnhance(new ImRemoveTagRequest(serviceName));
    }
    public ImRemoveAllTagsRequest imRemoveAllTagsPrepare(){
        return (ImRemoveAllTagsRequest) Academy.requestEnhance(new ImRemoveAllTagsRequest(serviceName));
    }
    public QueryStateRequest queryStatePrepare(){
        return (QueryStateRequest) Academy.requestEnhance(new QueryStateRequest(serviceName));
    }
}
