package model;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class AccountRemoveAttrs {
    @JSONField(name = "To_Account")
    private String account;
    @JSONField(name = "Attrs")
    private List<String> attrs;

    public String getAccount() {
        return account;
    }

    public AccountRemoveAttrs setAccount(String account) {
        this.account = account;
        return this;
    }

    public List<String> getAttrs() {
        return attrs;
    }

    public AccountRemoveAttrs setAttrs(List<String> attrs) {
        if (this.attrs != null) {
            this.attrs.addAll(attrs);
        } else {
            this.attrs = attrs;
        }
        return this;
    }
    public AccountRemoveAttrs setAttrs(String... attrs) {
        if (this.attrs == null) {
            this.attrs=new LinkedList<>();
        }
        Collections.addAll(this.attrs,attrs);
        return this;
    }
}
