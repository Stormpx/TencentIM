package request.openim.push;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import model.AccountAttrs;
import request.GeneralRequest;
import response.GeneralResponse;
import util.VariableUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Command("im_set_attr")
public class ImSetAttrRequest extends GeneralRequest<GeneralResponse> {
    @JSONField(name = "UserAttrs")
    private List<AccountAttrs> userAttrs;
    public ImSetAttrRequest(String serviceName) {
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

    public ImSetAttrRequest setUserAttrs(List<AccountAttrs> userAttrs) {
        this.userAttrs = userAttrs;return this;
    }
    public ImSetAttrRequest setUserAttrs(AccountAttrs... userAttrs) {
        if (this.userAttrs==null){
            this.userAttrs=new ArrayList<>();
        }
        Collections.addAll(this.userAttrs,userAttrs);
        return this;
    }
}
