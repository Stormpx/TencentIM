package model;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Map;

public class AccountAttrs {
    @JSONField(name = "To_Account")
    private String account;
    @JSONField(name = "Attrs")
    private Map<String,String> attrs;

    public String getAccount() {
        return account;
    }

    public AccountAttrs setAccount(String account) {
        this.account = account;return this;
    }

    public Map<String, String> getAttrs() {
        return attrs;
    }

    public AccountAttrs setAttrs(Map<String, String> attrs) {
        this.attrs = attrs;return this;
    }
}
