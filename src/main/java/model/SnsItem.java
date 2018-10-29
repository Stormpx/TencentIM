package model;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SnsItem {
    @JSONField(name = "Tag")
    private String tag;
    @JSONField(name = "Value")
    private Object Value;

    public String getTag() {
        return tag;
    }

    public SnsItem setTag(String tag) {
        this.tag = tag;return this;
    }

    public Object getValue() {
        return Value;
    }

    public Object setValue(Object value) {
        Value = value;return this;
    }
}
