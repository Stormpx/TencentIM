package core.api;

import annotation.ServiceName;
import core.enhance.Academy;
import request.groupopenhttpsvc.*;

@ServiceName("group_open_http_svc")
public class GroupOpenHttpSvc {
    private final static String serviceName="group_open_http_svc";
    public GetAppidGroupListRequest getAppidGroupListPrepare(){
        return (GetAppidGroupListRequest) Academy.requestEnhance(new GetAppidGroupListRequest(serviceName));
    }
    public CreateGroupRequset createGroupPrepare(){
        return (CreateGroupRequset) Academy.requestEnhance(new CreateGroupRequset(serviceName));
    }
    public GetGroupInfoRequest getGroupInfoPrepare(){
        return (GetGroupInfoRequest) Academy.requestEnhance(new GetGroupInfoRequest(serviceName));
    }
    public GetGroupMemberInfoRequest getGroupMemberInfoPrepare(){
        return (GetGroupMemberInfoRequest) Academy.requestEnhance(new GetGroupMemberInfoRequest(serviceName));
    }
    public ModifyGroupBaseInfoRequest modifyGroupBaseInfoPrepare(){
        return (ModifyGroupBaseInfoRequest) Academy.requestEnhance(new ModifyGroupBaseInfoRequest(serviceName));
    }
    public AddGroupMemberRequest addGroupMemberPrepare(){
        return (AddGroupMemberRequest) Academy.requestEnhance(new AddGroupMemberRequest(serviceName));
    }
    public DeleteGroupMemberRequest deleteGroupMemberPrepare(){
        return (DeleteGroupMemberRequest) Academy.requestEnhance(new DeleteGroupMemberRequest(serviceName));
    }
    public ModifyGroupMemberInfoRequest modifyGroupMemberInfoPrepare(){
        return (ModifyGroupMemberInfoRequest) Academy.requestEnhance(new ModifyGroupMemberInfoRequest(serviceName));
    }
    public DestroyGroupRequest destroyGroupPrepare(){
        return (DestroyGroupRequest) Academy.requestEnhance(new DestroyGroupRequest(serviceName));
    }
    public GetJoinedGroupListRequest getJoinedGroupListPrepare(){
        return (GetJoinedGroupListRequest) Academy.requestEnhance(new GetJoinedGroupListRequest(serviceName));
    }
    public GetRoleInGroupRequest getRoleInGroupPrepare(){
        return (GetRoleInGroupRequest) Academy.requestEnhance(new GetRoleInGroupRequest(serviceName));
    }
    public ForbidSendMsgRequest forbidSendMsgPrepare(){
        return (ForbidSendMsgRequest) Academy.requestEnhance(new ForbidSendMsgRequest(serviceName));
    }
    public GetGroupShuttedUinRequest getGroupShuttedUinPrepare(){
        return (GetGroupShuttedUinRequest) Academy.requestEnhance(new GetGroupShuttedUinRequest(serviceName));
    }
    public SendGroupMsgRequest sendGroupMsgPrepare(){
        return (SendGroupMsgRequest) Academy.requestEnhance(new SendGroupMsgRequest(serviceName));
    }
    public SendGroupSystemNotificationRequest sendGroupSystemNotificationPrepare(){
        return (SendGroupSystemNotificationRequest) Academy.requestEnhance(new SendGroupSystemNotificationRequest(serviceName));
    }
    public GroupMsgRecallRequest groupMsgRecallPrepare(){
        return (GroupMsgRecallRequest) Academy.requestEnhance(new GroupMsgRecallRequest(serviceName));
    }
    public ChangeGroupOwnerRequest changeGroupOwnerPrepare(){
        return (ChangeGroupOwnerRequest) Academy.requestEnhance(new ChangeGroupOwnerRequest(serviceName));
    }
    public ImportGroupRequest importGroupPrepare(){
        return (ImportGroupRequest) Academy.requestEnhance(new ImportGroupRequest(serviceName));
    }
    public ImportGroupMsgRequest importGroupMsgPrepare(){
        return (ImportGroupMsgRequest) Academy.requestEnhance(new ImportGroupMsgRequest(serviceName));
    }
    public ImportGroupMemberRequest importGroupMemberPrepare(){
        return (ImportGroupMemberRequest) Academy.requestEnhance(new ImportGroupMemberRequest(serviceName));
    }
    public SetUnreadMsgNumRequest setUnreadMsgNumPrepare(){
        return (SetUnreadMsgNumRequest) Academy.requestEnhance(new SetUnreadMsgNumRequest(serviceName));
    }
    public DeleteGroupMsgBySenderRequest deleteGroupMsgBySenderPrepare(){
        return (DeleteGroupMsgBySenderRequest) Academy.requestEnhance(new DeleteGroupMsgBySenderRequest(serviceName));
    }
    public GroupMsgGetSimpleRequest groupMsgGetSimplePrepare(){
        return (GroupMsgGetSimpleRequest) Academy.requestEnhance(new GroupMsgGetSimpleRequest(serviceName));
    }
}
