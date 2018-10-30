package request.sns;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import response.BlackListGetResponse;

@Command("black_list_get")
public class BlackListGetRequest extends SnsRequest<BlackListGetResponse> {
    @JSONField(name = "StartIndex")
    private Integer startIndex;
    @JSONField(name = "MaxLimited")
    private Integer maxLimited;
    @JSONField(name = "LastSequence")
    private Integer lastSequence;

    public BlackListGetRequest(String serviceName) {
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

    public BlackListGetRequest setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
        return this;
    }

    public BlackListGetRequest setMaxLimited(Integer maxLimited) {
        this.maxLimited = maxLimited;
        return this;
    }

    public BlackListGetRequest setLastSequence(Integer lastSequence) {
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
    public BlackListGetRequest setFromAccount(String fromAccount) {
        super.fromAccount = fromAccount;
        return this;
    }
}
