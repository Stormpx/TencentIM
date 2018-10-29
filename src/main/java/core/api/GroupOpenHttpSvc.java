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
    public AddGroupMember addGroupMemberPrepare(){
        return (AddGroupMember) Academy.requestEnhance(new AddGroupMember(serviceName));
    }
    public DeleteGroupMember deleteGroupMemberPrepare(){
        return (DeleteGroupMember) Academy.requestEnhance(new DeleteGroupMember(serviceName));
    }
    public ModifyGroupMemberInfo modifyGroupMemberInfoPrepare(){
        return (ModifyGroupMemberInfo) Academy.requestEnhance(new ModifyGroupMemberInfo(serviceName));
    }
    public DestroyGroup destroyGroupPrepare(){
        return (DestroyGroup) Academy.requestEnhance(new DestroyGroup(serviceName));
    }
    public GetJoinedGroupList getJoinedGroupListPrepare(){
        return (GetJoinedGroupList) Academy.requestEnhance(new GetJoinedGroupList(serviceName));
    }
    public GetRoleInGroup getRoleInGroupPrepare(){
        return (GetRoleInGroup) Academy.requestEnhance(new GetRoleInGroup(serviceName));
    }
    public ForbidSendMsg forbidSendMsgPrepare(){
        return (ForbidSendMsg) Academy.requestEnhance(new ForbidSendMsg(serviceName));
    }
    public GetGroupShuttedUin getGroupShuttedUinPrepare(){
        return (GetGroupShuttedUin) Academy.requestEnhance(new GetGroupShuttedUin(serviceName));
    }
    public SendGroupMsg sendGroupMsgPrepare(){
        return (SendGroupMsg) Academy.requestEnhance(new SendGroupMsg(serviceName));
    }
    public SendGroupSystemNotification sendGroupSystemNotificationPrepare(){
        return (SendGroupSystemNotification) Academy.requestEnhance(new SendGroupSystemNotification(serviceName));
    }
    public GroupMsgRecall groupMsgRecallPrepare(){
        return (GroupMsgRecall) Academy.requestEnhance(new GroupMsgRecall(serviceName));
    }
    public ChangeGroupOwner changeGroupOwnerPrepare(){
        return (ChangeGroupOwner) Academy.requestEnhance(new ChangeGroupOwner(serviceName));
    }
    public ImportGroup importGroupPrepare(){
        return (ImportGroup) Academy.requestEnhance(new ImportGroup(serviceName));
    }
    public ImportGroupMsg importGroupMsgPrepare(){
        return (ImportGroupMsg) Academy.requestEnhance(new ImportGroupMsg(serviceName));
    }
    public ImportGroupMember importGroupMemberPrepare(){
        return (ImportGroupMember) Academy.requestEnhance(new ImportGroupMember(serviceName));
    }
    public SetUnreadMsgNum setUnreadMsgNumPrepare(){
        return (SetUnreadMsgNum) Academy.requestEnhance(new SetUnreadMsgNum(serviceName));
    }
    public DeleteGroupMsgBySender deleteGroupMsgBySenderPrepare(){
        return (DeleteGroupMsgBySender) Academy.requestEnhance(new DeleteGroupMsgBySender(serviceName));
    }
    public GroupMsgGetSimple groupMsgGetSimplePrepare(){
        return (GroupMsgGetSimple) Academy.requestEnhance(new GroupMsgGetSimple(serviceName));
    }
}
