package model;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ResponseFilter {
    @JSONField(name = "GroupBaseInfoFilter")
    private List<String> groupBaseInfoFilter;
    @JSONField(name = "MemberInfoFilter")
    private List<String> memberInfoFilter;
    @JSONField(name = "SelfInfoFilter")
    private List<String> selfInfoFilter;
    @JSONField(name = "AppDefinedDataFilter_Group")
    private List<String> appDefinedDataFilterGroup;
    @JSONField(name = "AppDefinedDataFilter_GroupMember")
    private List<String> appDefinedDataFilterGroupMember;

    public ResponseFilter setGroupBaseInfoFilter(List<String> groupBaseInfoFilter) {
        this.groupBaseInfoFilter = groupBaseInfoFilter; return this;
    }

    public ResponseFilter setGroupBaseInfoFilter(String... groupBaseInfoFilter) {
        if (this.groupBaseInfoFilter == null) {
            this.groupBaseInfoFilter = new ArrayList<>();
        } Collections.addAll(this.groupBaseInfoFilter, groupBaseInfoFilter); return this;

    }

    public List<String> getSelfInfoFilter() {
        return selfInfoFilter;
    }

    public void setSelfInfoFilter(List<String> selfInfoFilter) {
        this.selfInfoFilter = selfInfoFilter;
    }
    public ResponseFilter setSelfInfoFilter(String... selfInfoFilter) {
        if (this.selfInfoFilter == null) {
            this.selfInfoFilter = new ArrayList<>();
        } Collections.addAll(this.selfInfoFilter, selfInfoFilter); return this;

    }

    public ResponseFilter setMemberInfoFilter(List<String> memberInfoFilter) {
        this.memberInfoFilter = memberInfoFilter; return this;
    }

    public ResponseFilter setMemberInfoFilter(String... memberInfoFilter) {
        if (this.memberInfoFilter == null) {
            this.memberInfoFilter = new ArrayList<>();
        } Collections.addAll(this.memberInfoFilter, memberInfoFilter); return this;
    }

    public ResponseFilter setAppDefinedDataFilterGroup(List<String> appDefinedDataFilterGroup) {
        this.appDefinedDataFilterGroup = appDefinedDataFilterGroup; return this;
    }

    public ResponseFilter setAppDefinedDataFilterGroup(String... appDefinedDataFilterGroup) {
        if (this.appDefinedDataFilterGroup == null) {
            this.appDefinedDataFilterGroup = new ArrayList<>();
        } Collections.addAll(this.appDefinedDataFilterGroup, appDefinedDataFilterGroup); return this;
    }

    public ResponseFilter setAppDefinedDataFilterGroupMember(List<String> appDefinedDataFilterGroupMember) {
        this.appDefinedDataFilterGroupMember = appDefinedDataFilterGroupMember; return this;
    }

    public ResponseFilter setAppDefinedDataFilterGroupMember(String... appDefinedDataFilterGroupMember) {
        if (this.appDefinedDataFilterGroupMember == null) {
            this.appDefinedDataFilterGroupMember = new ArrayList<>();
        } Collections.addAll(this.appDefinedDataFilterGroupMember, appDefinedDataFilterGroupMember); return this;
    }

    public List<String> getGroupBaseInfoFilter() {
        return groupBaseInfoFilter;
    }

    public List<String> getMemberInfoFilter() {
        return memberInfoFilter;
    }

    public List<String> getAppDefinedDataFilterGroup() {
        return appDefinedDataFilterGroup;
    }

    public List<String> getAppDefinedDataFilterGroupMember() {
        return appDefinedDataFilterGroupMember;
    }
}
