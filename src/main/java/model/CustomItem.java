package model;

import com.alibaba.fastjson.annotation.JSONField;

public class CustomItem {
    @JSONField(name = "Tag")
    private String tag;
    @JSONField(name = "Value")
    private Object Value;


    public String getTag() {
        return tag;
    }

    public CustomItem setTag(String tag) {
        this.tag = tag;
        return this;
    }

    public Object getValue() {
        return Value;
    }

    public CustomItem setValue(Object value) {
        Value = value;return this;
    }
}
