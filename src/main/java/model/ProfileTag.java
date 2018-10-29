package model;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;

public class ProfileTag {
    @JSONField(name = "Tag")
    private String tag;
    @JSONField(name = "value")
    private Object Value;


    public String getTag() {
        return tag;
    }

    public ProfileTag setTag(String profileKey) {
        this.tag = profileKey;return this;
    }

    public Object getValue() {
        return Value;
    }

    public ProfileTag setValue(Object value) {
        Value = value;return this;
    }

    @Override
    public String toString() {
        return "ProfileTag{" +
                "tag='" + tag + '\'' +
                ", Value=" + Value +
                '}';
    }

}
