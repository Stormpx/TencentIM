package request.groupopenhttpsvc;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import request.GeneralModel;
import util.VariableUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@Command("get_group_member_info")
public class GetGroupMemberInfo extends GeneralModel{
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
    public GetGroupMemberInfo(String serviceName) {
        super(serviceName);
    }

    @Override
    public String checkParam() {
        if (VariableUtil.isEmpty(groupId)){
            return "GroupId";
        }
        return null;
    }

    public GetGroupMemberInfo setGroupId(String groupId) {
        this.groupId = groupId;return this;
    }

    public GetGroupMemberInfo setLimit(Integer limit) {
        this.limit = limit;return this;
    }

    public GetGroupMemberInfo setOffset(Integer offset) {
        this.offset = offset;return this;
    }

    public GetGroupMemberInfo setMemberInfoFilter(List<String> memberInfoFilter) {
        this.memberInfoFilter = memberInfoFilter;return this;
    }
    public GetGroupMemberInfo setMemberInfoFilter(String... memberInfoFilter) {
        if (this.memberInfoFilter==null){
            this.memberInfoFilter=new LinkedList<>();
        }
        Collections.addAll(this.memberInfoFilter,memberInfoFilter);
        return this;
    }
    public GetGroupMemberInfo setMemberRoleFilter(List<String> memberRoleFilter) {
        this.memberRoleFilter = memberRoleFilter;return this;
    }
    public GetGroupMemberInfo setMemberRoleFilter(String... memberRoleFilter) {
        if (this.memberRoleFilter==null){
            this.memberRoleFilter=new LinkedList<>();
        }
        Collections.addAll(this.memberRoleFilter,memberRoleFilter);
        return this;
    }
    public GetGroupMemberInfo setAppDefinedDataFilterGroupMember(List<String> appDefinedDataFilterGroupMember) {
        this.appDefinedDataFilterGroupMember = appDefinedDataFilterGroupMember;return this;
    }
    public GetGroupMemberInfo setAppDefinedDataFilterGroupMember(String... appDefinedDataFilterGroupMember) {
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
