package request.sns;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import util.VariableUtil;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@Command("friend_get_all")
public class FriendGetAll extends SnsModel {
    @JSONField(name = "TimeStamp")
    private Integer timeStamp;
    @JSONField(name = "StartIndex")
    private Integer startIndex;
    @JSONField(name = "LastStandardSequence")
    private Integer lastStandardSequence;
    @JSONField(name = "GetCount")
    private Integer getCount;
    @JSONField(name = "TagList")
    private List<String> tagList;
    public FriendGetAll(String serviceName) {
        super(serviceName);
    }

    @Override
    protected String check() {
        if (startIndex==null){
            return "StartIndex";
        }
        return null;
    }

    public FriendGetAll setTimeStamp(Integer timeStamp) {
        this.timeStamp = timeStamp;return this;
    }

    public FriendGetAll setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;return this;
    }

    public FriendGetAll setLastStandardSequence(Integer lastStandardSequence) {
        this.lastStandardSequence = lastStandardSequence;return this;
    }

    public FriendGetAll setGetCount(Integer getCount) {
        this.getCount = getCount;return this;
    }

    public FriendGetAll setTagList(List<String> tagList) {
        this.tagList = tagList;return this;
    }
    public FriendGetAll setTagList(String... tagList) {
        if (this.tagList==null){
            this.tagList=new LinkedList<>();
        }
        Collections.addAll(this.tagList ,tagList);
        return this;
    }
    public FriendGetAll setFromAccount(String fromAccount) {
        super.fromAccount = fromAccount;
        return this;
    }
    public Integer getTimeStamp() {
        return timeStamp;
    }

    public Integer getStartIndex() {
        return startIndex;
    }

    public Integer getLastStandardSequence() {
        return lastStandardSequence;
    }

    public Integer getGetCount() {
        return getCount;
    }

    public List<String> getTagList() {
        return tagList;
    }
}
