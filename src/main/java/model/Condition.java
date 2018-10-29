package model;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;
import java.util.Map;

public class Condition {
    @JSONField(name = "TagsAnd")
    private List<String> tagsAnd;
    @JSONField(name = "TagsOr")
    private List<String> tagsOr;
    @JSONField(name = "AttrsAnd")
    private Map<String,String> attrsAnd;
    @JSONField(name = "AttrsOr")
    private Map<String,String> attrsOr;

    public List<String> getTagsAnd() {
        return tagsAnd;
    }

    public void setTagsAnd(List<String> tagsAnd) {
        this.tagsAnd = tagsAnd;
    }

    public List<String> getTagsOr() {
        return tagsOr;
    }

    public void setTagsOr(List<String> tagsOr) {
        this.tagsOr = tagsOr;
    }

    public Map<String, String> getAttrsAnd() {
        return attrsAnd;
    }

    public void setAttrsAnd(Map<String, String> attrsAnd) {
        this.attrsAnd = attrsAnd;
    }

    public Map<String, String> getAttrsOr() {
        return attrsOr;
    }

    public void setAttrsOr(Map<String, String> attrsOr) {
        this.attrsOr = attrsOr;
    }
}
