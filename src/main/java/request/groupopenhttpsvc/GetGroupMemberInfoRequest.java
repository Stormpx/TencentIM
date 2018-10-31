package request.groupopenhttpsvc;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import request.GeneralRequest;
import response.GetGroupMemberInfoResponse;
import util.VariableUtil;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@Command("get_group_member_info")
public class GetGroupMemberInfoRequest extends GeneralRequest<GetGroupMemberInfoResponse> {
    @JSONField(name = "GroupId")
    private String groupId;
    @JSONField(name = "Limit")
    private Integer limit;
    @JSONField(name = "Offset")
    private Integer offset;
    @JSONField(name = "MemberInfoFilter")
    private List<String> memberInfoFilter;
    @JSONField(name = "MemberRoleFilter")
    private List<String> memberRoleFilter;
    @JSONField(name = "AppDefinedDataFilter_GroupMember")
    private List<String> appDefinedDataFilterGroupMember;
    public GetGroupMemberInfoRequest(String serviceName) {
        super(serviceName);
    }

    @Override
    protected String checkParam() {
        if (VariableUtil.isEmpty(groupId)){
            return "GroupId";
        }
        return null;
    }

    public GetGroupMemberInfoRequest setGroupId(String groupId) {
        this.groupId = groupId;return this;
    }

    public GetGroupMemberInfoRequest setLimit(Integer limit) {
        this.limit = limit;return this;
    }

    public GetGroupMemberInfoRequest setOffset(Integer offset) {
        this.offset = offset;return this;
    }

    public GetGroupMemberInfoRequest setMemberInfoFilter(List<String> memberInfoFilter) {
        this.memberInfoFilter = memberInfoFilter;return this;
    }
    public GetGroupMemberInfoRequest setMemberInfoFilter(String... memberInfoFilter) {
        if (this.memberInfoFilter==null){
            this.memberInfoFilter=new LinkedList<>();
        }
        Collections.addAll(this.memberInfoFilter,memberInfoFilter);
        return this;
    }
    public GetGroupMemberInfoRequest setMemberRoleFilter(List<String> memberRoleFilter) {
        this.memberRoleFilter = memberRoleFilter;return this;
    }
    public GetGroupMemberInfoRequest setMemberRoleFilter(String... memberRoleFilter) {
        if (this.memberRoleFilter==null){
            this.memberRoleFilter=new LinkedList<>();
        }
        Collections.addAll(this.memberRoleFilter,memberRoleFilter);
        return this;
    }
    public GetGroupMemberInfoRequest setAppDefinedDataFilterGroupMember(List<String> appDefinedDataFilterGroupMember) {
        this.appDefinedDataFilterGroupMember = appDefinedDataFilterGroupMember;return this;
    }
    public GetGroupMemberInfoRequest setAppDefinedDataFilterGroupMember(String... appDefinedDataFilterGroupMember) {
        if (this.appDefinedDataFilterGroupMember==null){
            this.appDefinedDataFilterGroupMember=new LinkedList<>();
        }
        Collections.addAll(this.appDefinedDataFilterGroupMember,appDefinedDataFilterGroupMember);
        return this;
    }

    public String getGroupId() {
        return groupId;
    }

    public Integer getLimit() {
        return limit;
    }

    public Integer getOffset() {
        return offset;
    }

    public List<String> getMemberInfoFilter() {
        return memberInfoFilter;
    }

    public List<String> getMemberRoleFilter() {
        return memberRoleFilter;
    }

    public List<String> getAppDefinedDataFilterGroupMember() {
        return appDefinedDataFilterGroupMember;
    }
}
