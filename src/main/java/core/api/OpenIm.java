package core.api;

import annotation.ServiceName;
import core.enhance.Academy;
import request.openim.line.QueryStateRequest;
import request.openim.msg.BatchSendMsgRequest;
import request.openim.push.*;
import request.openim.msg.SendMsgRequest;

@ServiceName("openim")
public class OpenIm {

    public SendMsgRequest sendMsgPrepare() {
        return new SendMsgRequest();
    }

    public BatchSendMsgRequest batchSendMsgPrepare() {
        return new BatchSendMsgRequest();
    }

    public ImportMsgRequest importMsgPrepare() {
        return new ImportMsgRequest();
    }

    public ImPushRequest imPushPrepare(){
        return new ImPushRequest();
    }
    public ImGetPushReportRequest imGetPushReportPrepare() {
        return new ImGetPushReportRequest();
    }

    public ImSetAttrNameRequest imSetAttrNamePrepare() {
        return new ImSetAttrNameRequest();
    }

    public ImGetAttrNameRequest imGetAttrNamePrepare() {
        return new ImGetAttrNameRequest();
    }

    public ImSetAttrRequest imSetAttrPrepare() {
        return new ImSetAttrRequest();
    }
    public ImRemoveAttrRequest imRemoveAttrPrepare(){return new ImRemoveAttrRequest();}
    public ImGetAttrRequest imGetAttrPrepare(){
        return new ImGetAttrRequest();
    }
    public ImAddTagRequest imAddTagPrepare(){
        return new ImAddTagRequest();
    }
    public ImGetTagRequest imGetTagPrepare(){
        return new ImGetTagRequest();
    }
    public ImRemoveTagRequest imRemoveTagPrepare(){
        return new ImRemoveTagRequest();
    }
    public ImRemoveAllTagsRequest imRemoveAllTagsPrepare(){
        return new ImRemoveAllTagsRequest();
    }
    public QueryStateRequest queryStatePrepare(){
        return new QueryStateRequest();
    }
}
