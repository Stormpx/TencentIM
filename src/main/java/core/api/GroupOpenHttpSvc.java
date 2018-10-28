package core.api;

import annotation.ServiceName;
import core.enhance.Academy;
import request.groupopenhttpsvc.*;

@ServiceName("group_open_http_svc")
public class GroupOpenHttpSvc {
    private final static String serviceName="group_open_http_svc";
    public GetAppidGroupList getAppidGroupListPrepare(){
        return (GetAppidGroupList) Academy.requestEnhance(new GetAppidGroupList(serviceName));
    }
    public CreateGroup createGroupPrepare(){
        return (CreateGroup) Academy.requestEnhance(new CreateGroup(serviceName));
    }
    public GetGroupInfo getGroupInfoPrepare(){
        return (GetGroupInfo) Academy.requestEnhance(new GetGroupInfo(serviceName));
    }
    public GetGroupMemberInfo getGroupMemberInfoPrepare(){
        return (GetGroupMemberInfo) Academy.requestEnhance(new GetGroupMemberInfo(serviceName));
    }
    public ModifyGroupBaseInfo modifyGroupBaseInfoPrepare(){
        return (ModifyGroupBaseInfo) Academy.requestEnhance(new ModifyGroupBaseInfo(serviceName));
    }
}
