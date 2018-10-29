package model;

import com.alibaba.fastjson.annotation.JSONField;

public class AppDefinedData {
    @JSONField(name = "Tag")
    private String tag;
    @JSONField(name = "value")
    private Object Value;

    public String getTag() {
        return tag;
    }

    public AppDefinedData setTag(String tag) {
        this.tag = tag;return this;
    }

    public Object getValue() {
        return Value;
    }

    public AppDefinedData setValue(Object value) {
        Value = value;return this;
    }
}
