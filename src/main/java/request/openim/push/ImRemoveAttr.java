package request.openim.push;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import model.AccountAttrs;
import request.GeneralModel;
import util.VariableUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@Command("im_remove_attr")
public class ImRemoveAttr extends GeneralModel {
    @JSONField(name = "UserAttrs")
    private List<AccountAttrs> userAttrs;
    public ImRemoveAttr(String serviceName) {
        super(serviceName);
    }

    @Override
    public String checkParam() {
        if (VariableUtil.isEmpty(userAttrs)){
            return "UserAttrs";
        }
        return null;
    }

    public List<AccountAttrs> getUserAttrs() {
        return userAttrs;
    }

    public ImRemoveAttr setUserAttrs(List<AccountAttrs> userAttrs) {
        this.userAttrs = userAttrs;return this;
    }
    public ImRemoveAttr setUserAttrs(AccountAttrs... userAttrs) {
        if (this.userAttrs==null){
            this.userAttrs=new ArrayList<>();
        }
        Collections.addAll(this.userAttrs,userAttrs);return this;
    }
}
