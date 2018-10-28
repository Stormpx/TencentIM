package model;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Member {
    @JSONField(name = "Member_Account")
    private String memberAccount;
    @JSONField(name = "Role")
    private String role;
    @JSONField(name = "AppMemberDefinedData")
    private List<AppDefinedData> appDefinedData;

    public String getMemberAccount() {
        return memberAccount;
    }

    public Member setMemberAccount(String memberAccount) {
        this.memberAccount = memberAccount;return this;
    }

    public String getRole() {
        return role;
    }

    public Member setRole(String role) {
        this.role = role;return this;
    }

    public List<AppDefinedData> getAppDefinedData() {
        return appDefinedData;
    }

    public Member setAppDefinedData(List<AppDefinedData> appDefinedData) {
        this.appDefinedData = appDefinedData;return this;
    }
    public Member setAppDefinedData(AppDefinedData... appDefinedData) {
        if (this.appDefinedData==null){
            this.appDefinedData=new ArrayList<>();
        }
        Collections.addAll(this.appDefinedData,appDefinedData);return this;
    }
}
