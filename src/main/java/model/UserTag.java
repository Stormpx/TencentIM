package model;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

public class UserTag {
    @JSONField(name = "To_Account")
    private String to_Account;
    @JSONField(name = "Tags")
    private List<String> tags;

    public String getTo_Account() {
        return to_Account;
    }

    public UserTag setTo_Account(String to_Account) {
        this.to_Account = to_Account;return this;
    }

    public List<String> getTags() {
        return tags;
    }

    public UserTag setTags(List<String> tags) {
        this.tags = tags;return this;
    }
}
