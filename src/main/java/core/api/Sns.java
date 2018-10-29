package core.api;

import annotation.ServiceName;
import core.enhance.Academy;
import request.openmsgsvc.GetHistory;
import request.sns.*;

@ServiceName("sns")
public class Sns {
    private final static String serviceName="sns";
    public FriendAdd friendAddPrepare(){
        return (FriendAdd) Academy.requestEnhance(new FriendAdd(serviceName));
    }
    public FriendImport friendImportPrepare(){
        return (FriendImport) Academy.requestEnhance(new FriendImport(serviceName));
    }
    public FriendUpdate friendUpdatePrepare(){
        return (FriendUpdate) Academy.requestEnhance(new FriendUpdate(serviceName));
    }
    public FriendDelete friendDeletePrepare(){
        return (FriendDelete) Academy.requestEnhance(new FriendDelete(serviceName));
    }
    public FriendDeleteAll friendDeleteAllPrepare(){
        return (FriendDeleteAll) Academy.requestEnhance(new FriendDeleteAll(serviceName));
    }
    public FriendCheck friendCheckPrepare(){
        return (FriendCheck) Academy.requestEnhance(new FriendCheck(serviceName));
    }
    public FriendGetAll friendGetAllPrepare(){
        return (FriendGetAll) Academy.requestEnhance(new FriendGetAll(serviceName));
    }
    public FriendGetList friendGetListPrepare(){
        return (FriendGetList) Academy.requestEnhance(new FriendGetList(serviceName));
    }
    public BlackListAdd blackListAddPrepare(){
        return (BlackListAdd) Academy.requestEnhance(new BlackListAdd(serviceName));
    }
    public BlackListDelete blackListDeletePrepare(){
        return (BlackListDelete) Academy.requestEnhance(new BlackListDelete(serviceName));
    }
    public BlackListGet blackListGetPrepare(){
        return (BlackListGet) Academy.requestEnhance(new BlackListGet(serviceName));
    }
    public BlackListCheck blackListCheckPrepare(){
        return (BlackListCheck) Academy.requestEnhance(new BlackListCheck(serviceName));
    }
    public GroupAdd groupAddPrepare(){
        return (GroupAdd) Academy.requestEnhance(new GroupAdd(serviceName));
    }
    public GroupDelete groupDeletePrepare(){
        return (GroupDelete) Academy.requestEnhance(new GroupDelete(serviceName));
    }
}
