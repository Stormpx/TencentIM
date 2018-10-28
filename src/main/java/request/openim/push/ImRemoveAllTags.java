package request.openim.push;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import request.GeneralModel;
import util.VariableUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Command("im_remove_all_tags")
public class ImRemoveAllTags extends GeneralModel {
    @JSONField(name = "To_Account")
    private List<String> to_Account;
    public ImRemoveAllTags(String serviceName) {
        super(serviceName);
    }

    @Override
    public String checkParam() {
        if (VariableUtil.isEmpty(to_Account)){
            return "To_Account";
        }
        return null;
    }



    public List<String> getTo_Account() {
        return to_Account;
    }

    public ImRemoveAllTags setTo_Account(List<String> to_Account) {
        this.to_Account = to_Account;return this;
    }
    public ImRemoveAllTags setTo_Account(String... to_Account) {
        if (this.to_Account==null){
            this.to_Account=new ArrayList<>();
        }
        Collections.addAll(this.to_Account,to_Account);
        return this;
    }
}
