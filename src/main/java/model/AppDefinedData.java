package model;

import com.alibaba.fastjson.annotation.JSONField;

public class AppDefinedData {
    @JSONField(name = "Tag")
    private String tag;
    @JSONField(name = "value")
    private String stringValue;
    @JSONField(name = "value")
    private byte[] byteValue;

    public String getTag() {
        return tag;
    }

    public AppDefinedData setTag(String tag) {
        this.tag = tag;return this;
    }

    public String getStringValue() {
        return stringValue;
    }

    public AppDefinedData setStringValue(String stringValue) {
        this.stringValue = stringValue;return this;
    }

    public byte[] getByteValue() {
        return byteValue;
    }

    public AppDefinedData setByteValue(byte[] byteValue) {
        this.byteValue = byteValue;return this;
    }
}
