package model;

import com.alibaba.fastjson.annotation.JSONField;

public class ProfileTag {
    @JSONField(name = "Tag")
    private String tag;
    @JSONField(name = "value")
    private Long longValue;
    @JSONField(name = "value")
    private Integer intValue;
    @JSONField(name = "value")
    private String stringValue;
    @JSONField(name = "value")
    private byte[] byteValue;

    public String getTag() {
        return tag;
    }

    public ProfileTag setTag(String profileKey) {
        this.tag = tag;return this;
    }

    public Long getLongValue() {
        return longValue;
    }

    public ProfileTag setLongValue(Long longValue) {
        this.longValue = longValue;return this;
    }

    public Integer getIntValue() {
        return intValue;
    }

    public ProfileTag setIntValue(Integer intValue) {
        this.intValue = intValue;return this;
    }

    public String getStringValue() {
        return stringValue;
    }

    public ProfileTag setStringValue(String stringValue) {
        this.stringValue = stringValue;return this;
    }

    public byte[] getByteValue() {
        return byteValue;
    }

    public ProfileTag setByteValue(byte[] byteValue) {
        this.byteValue = byteValue;return this;
    }
}
