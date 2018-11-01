package core.api;

import annotation.ServiceName;
import core.enhance.Academy;
import request.groupopenhttpsvc.*;

@ServiceName("group_open_http_svc")
public class GroupOpenHttpSvc {
    public GetAppidGroupListRequest getAppidGroupListPrepare(){
        return new GetAppidGroupListRequest();
    }
    public CreateGroupRequset createGroupPrepare(){
        return new CreateGroupRequset();
    }
    public GetGroupInfoRequest getGroupInfoPrepare(){
        return new GetGroupInfoRequest();
    }
    public GetGroupMemberInfoRequest getGroupMemberInfoPrepare(){
        return new GetGroupMemberInfoRequest();
    }
    public ModifyGroupBaseInfoRequest modifyGroupBaseInfoPrepare(){
        return new ModifyGroupBaseInfoRequest();
    }
    public AddGroupMemberRequest addGroupMemberPrepare(){
        return new AddGroupMemberRequest();
    }
    public DeleteGroupMemberRequest deleteGroupMemberPrepare(){
        return new DeleteGroupMemberRequest();
    }
    public ModifyGroupMemberInfoRequest modifyGroupMemberInfoPrepare(){
        return new ModifyGroupMemberInfoRequest();
    }
    public DestroyGroupRequest destroyGroupPrepare(){
        return new DestroyGroupRequest();
    }
    public GetJoinedGroupListRequest getJoinedGroupListPrepare(){
        return new GetJoinedGroupListRequest();
    }
    public GetRoleInGroupRequest getRoleInGroupPrepare(){
        return new GetRoleInGroupRequest();
    }
    public ForbidSendMsgRequest forbidSendMsgPrepare(){
        return new ForbidSendMsgRequest();
    }
    public GetGroupShuttedUinRequest getGroupShuttedUinPrepare(){
        return new GetGroupShuttedUinRequest();
    }
    public SendGroupMsgRequest sendGroupMsgPrepare(){
        return new SendGroupMsgRequest();
    }
    public SendGroupSystemNotificationRequest sendGroupSystemNotificationPrepare(){
        return new SendGroupSystemNotificationRequest();
    }
    public GroupMsgRecallRequest groupMsgRecallPrepare(){
        return new GroupMsgRecallRequest();
    }
    public ChangeGroupOwnerRequest changeGroupOwnerPrepare(){
        return new ChangeGroupOwnerRequest();
    }
    public ImportGroupRequest importGroupPrepare(){
        return new ImportGroupRequest();
    }
    public ImportGroupMsgRequest importGroupMsgPrepare(){
        return new ImportGroupMsgRequest();
    }
    public ImportGroupMemberRequest importGroupMemberPrepare(){
        return new ImportGroupMemberRequest();
    }
    public SetUnreadMsgNumRequest setUnreadMsgNumPrepare(){
        return new SetUnreadMsgNumRequest();
    }
    public DeleteGroupMsgBySenderRequest deleteGroupMsgBySenderPrepare(){
        return new DeleteGroupMsgBySenderRequest();
    }
    public GroupMsgGetSimpleRequest groupMsgGetSimplePrepare(){
        return new GroupMsgGetSimpleRequest();
    }
}
