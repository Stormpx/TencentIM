package request.openim.push;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import model.AccountAttrs;
import request.GeneralRequest;
import response.GeneralResponse;
import util.VariableUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@Command("im_set_attr")
public class ImSetAttrRequest extends GeneralRequest<GeneralResponse> {
    @JSONField(name = "UserAttrs")
    private List<AccountAttrs> userAttrs;

    @Override
    protected String checkParam() {
        if (VariableUtil.isEmpty(userAttrs)){
            return "UserAttrs";
        }
        return null;
    }

    public List<AccountAttrs> getUserAttrs() {
        return userAttrs;
    }

    public ImSetAttrRequest setUserAttrs(List<AccountAttrs> userAttrs) {
        if (this.userAttrs!=null){
            this.userAttrs.addAll(userAttrs);
        }else {
            this.userAttrs = userAttrs;
        }
        return this;
    }
    public ImSetAttrRequest setUserAttrs(AccountAttrs... userAttrs) {
        if (this.userAttrs==null){
            this.userAttrs=new LinkedList<>();
        }
        Collections.addAll(this.userAttrs,userAttrs);
        return this;
    }
}
