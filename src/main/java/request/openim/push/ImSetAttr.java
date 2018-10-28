package request.openim.push;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import model.AccountAttrs;
import request.GeneralModel;
import util.VariableUtil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Command("im_set_attr")
public class ImSetAttr extends GeneralModel {
    @JSONField(name = "UserAttrs")
    private List<AccountAttrs> userAttrs;
    public ImSetAttr(String serviceName) {
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

    public ImSetAttr setUserAttrs(List<AccountAttrs> userAttrs) {
        this.userAttrs = userAttrs;return this;
    }
    public ImSetAttr setUserAttrs(AccountAttrs... userAttrs) {
        if (this.userAttrs==null){
            this.userAttrs=new ArrayList<>();
        }
        Collections.addAll(this.userAttrs,userAttrs);
        return this;
    }
}
