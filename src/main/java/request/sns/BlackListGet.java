package request.sns;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;

@Command("black_list_get")
public class BlackListGet extends SnsModel {
    @JSONField(name = "StartIndex")
    private Integer startIndex;
    @JSONField(name = "MaxLimited")
    private Integer maxLimited;
    @JSONField(name = "LastSequence")
    private Integer lastSequence;

    public BlackListGet(String serviceName) {
        super(serviceName);
    }

    @Override
    protected String check() {
        if (startIndex == null) {
            return "StartIndex";
        }
        if (maxLimited == null) {
            return "MaxLimited";
        }
        if (lastSequence == null) {
            return "LastSequence";
        }
        return null;
    }

    public BlackListGet setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
        return this;
    }

    public BlackListGet setMaxLimited(Integer maxLimited) {
        this.maxLimited = maxLimited;
        return this;
    }

    public BlackListGet setLastSequence(Integer lastSequence) {
        this.lastSequence = lastSequence;
        return this;
    }

    public Integer getStartIndex() {
        return startIndex;
    }

    public Integer getMaxLimited() {
        return maxLimited;
    }

    public Integer getLastSequence() {
        return lastSequence;
    }
    public BlackListGet setFromAccount(String fromAccount) {
        super.fromAccount = fromAccount;
        return this;
    }
}
