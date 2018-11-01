package core.api;

import annotation.ServiceName;
import core.enhance.Academy;
import request.sns.*;

@ServiceName("sns")
public class Sns {

    public FriendAddRequest friendAddPrepare(){
        return new FriendAddRequest();
    }
    public FriendImportRequest friendImportPrepare(){
        return new FriendImportRequest();
    }
    public FriendUpdateRequest friendUpdatePrepare(){
        return new FriendUpdateRequest();
    }
    public FriendDeleteRequest friendDeletePrepare(){
        return new FriendDeleteRequest();
    }
    public FriendDeleteAllRequest friendDeleteAllPrepare(){
        return new FriendDeleteAllRequest();
    }
    public FriendCheckRequest friendCheckPrepare(){
        return new FriendCheckRequest();
    }
    public FriendGetAllRequest friendGetAllPrepare(){
        return new FriendGetAllRequest();
    }
    public FriendGetListRequest friendGetListPrepare(){
        return new FriendGetListRequest();
    }
    public BlackListAddRequest blackListAddPrepare(){
        return new BlackListAddRequest();
    }
    public BlackListDeleteRequest blackListDeletePrepare(){
        return new BlackListDeleteRequest();
    }
    public BlackListGetRequest blackListGetPrepare(){
        return new BlackListGetRequest();
    }
    public BlackListCheckRequest blackListCheckPrepare(){
        return new BlackListCheckRequest();
    }
    public GroupAddRequest groupAddPrepare(){
        return new GroupAddRequest();
    }
    public GroupDeleteRequest groupDeletePrepare(){
        return new GroupDeleteRequest();
    }
}
