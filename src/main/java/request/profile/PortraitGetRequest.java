package request.profile;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import request.GeneralRequest;
import response.PortraitGetResponse;
import util.VariableUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Command("portrait_get")
public class PortraitGetRequest extends GeneralRequest<PortraitGetResponse> {
    @JSONField(name = "To_Account")
    private List<String> toAccount;
    @JSONField(name = "TagList")
    private List<String> tagList;

    public PortraitGetRequest(String serviceName) {
        super(serviceName);
    }

    @Override
    protected String checkParam() {
        if (VariableUtil.isEmpty(toAccount)) {
            return "To_Account";
        }
        if (VariableUtil.isEmpty(tagList)) {
            return "TagList";
        }
        return null;
    }

    public List<String> getToAccount() {
        return toAccount;
    }

    public PortraitGetRequest setToAccount(List<String> toAccount) {
        if (this.toAccount != null) {
            this.toAccount.addAll(toAccount);
        } else {
            this.toAccount = toAccount;
        }
        return this;
    }

    public PortraitGetRequest setToAccount(String... toAccount) {
        if (this.toAccount == null) {
            this.toAccount = new ArrayList<>();
        }
        Collections.addAll(this.toAccount, toAccount);
        return this;
    }

    public List<String> getTagList() {
        return tagList;
    }

    public PortraitGetRequest setTagList(List<String> tagList) {

        if (this.tagList != null) {
            this.tagList.addAll(tagList);
        } else {
            this.tagList = toAccount;
        }
        return this;
    }

    public PortraitGetRequest setTagList(String... tagList) {
        if (this.tagList == null) {
            this.tagList = new ArrayList<>();
        }
        Collections.addAll(this.tagList, tagList);
        return this;
    }
}
