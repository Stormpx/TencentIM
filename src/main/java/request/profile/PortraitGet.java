package request.profile;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import request.GeneralModel;
import util.VariableUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Command("portrait_get")
public class PortraitGet extends GeneralModel {
    @JSONField(name = "To_Account")
    private List<String> toAccount;
    @JSONField(name = "TagList")
    private List<String> tagList;
    public PortraitGet(String serviceName) {
        super(serviceName);
    }

    @Override
    public String checkParam() {
        if (VariableUtil.isEmpty(toAccount)){
            return "To_Account";
        }
        if (VariableUtil.isEmpty(tagList)){
            return "TagList";
        }
        return null;
    }

    public List<String> getToAccount() {
        return toAccount;
    }

    public PortraitGet setToAccount(List<String> toAccount) {
        this.toAccount = toAccount;return this;
    }
    public PortraitGet setToAccount(String... toAccount) {
        if (this.toAccount==null){
            this.toAccount =new ArrayList<>();
        }
        Collections.addAll(this.toAccount,toAccount);
        return this;
    }
    public List<String> getTagList() {
        return tagList;
    }

    public PortraitGet setTagList(List<String> tagList) {

        this.tagList = tagList;return this;
    }

    public PortraitGet setTagList(String... tagList) {
        if (this.tagList==null){
            this.tagList =new ArrayList<>();
        }
        Collections.addAll(this.tagList,tagList);
        return this;
    }
}
