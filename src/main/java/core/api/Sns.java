package core.api;

import annotation.ServiceName;
import core.enhance.Academy;
import request.sns.*;

@ServiceName("sns")
public class Sns {
    private final static String serviceName="sns";
    public FriendAddRequest friendAddPrepare(){
        return (FriendAddRequest) Academy.requestEnhance(new FriendAddRequest(serviceName));
    }
    public FriendImportRequest friendImportPrepare(){
        return (FriendImportRequest) Academy.requestEnhance(new FriendImportRequest(serviceName));
    }
    public FriendUpdateRequest friendUpdatePrepare(){
        return (FriendUpdateRequest) Academy.requestEnhance(new FriendUpdateRequest(serviceName));
    }
    public FriendDeleteRequest friendDeletePrepare(){
        return (FriendDeleteRequest) Academy.requestEnhance(new FriendDeleteRequest(serviceName));
    }
    public FriendDeleteAllRequest friendDeleteAllPrepare(){
        return (FriendDeleteAllRequest) Academy.requestEnhance(new FriendDeleteAllRequest(serviceName));
    }
    public FriendCheckRequest friendCheckPrepare(){
        return (FriendCheckRequest) Academy.requestEnhance(new FriendCheckRequest(serviceName));
    }
    public FriendGetAllRequest friendGetAllPrepare(){
        return (FriendGetAllRequest) Academy.requestEnhance(new FriendGetAllRequest(serviceName));
    }
    public FriendGetListRequest friendGetListPrepare(){
        return (FriendGetListRequest) Academy.requestEnhance(new FriendGetListRequest(serviceName));
    }
    public BlackListAddRequest blackListAddPrepare(){
        return (BlackListAddRequest) Academy.requestEnhance(new BlackListAddRequest(serviceName));
    }
    public BlackListDeleteRequest blackListDeletePrepare(){
        return (BlackListDeleteRequest) Academy.requestEnhance(new BlackListDeleteRequest(serviceName));
    }
    public BlackListGetRequest blackListGetPrepare(){
        return (BlackListGetRequest) Academy.requestEnhance(new BlackListGetRequest(serviceName));
    }
    public BlackListCheckRequest blackListCheckPrepare(){
        return (BlackListCheckRequest) Academy.requestEnhance(new BlackListCheckRequest(serviceName));
    }
    public GroupAddRequest groupAddPrepare(){
        return (GroupAddRequest) Academy.requestEnhance(new GroupAddRequest(serviceName));
    }
    public GroupDeleteRequest groupDeletePrepare(){
        return (GroupDeleteRequest) Academy.requestEnhance(new GroupDeleteRequest(serviceName));
    }
}
