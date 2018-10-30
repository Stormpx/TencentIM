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
@Command("im_remove_attr")
public class ImRemoveAttrRequest extends GeneralRequest<GeneralResponse> {
    @JSONField(name = "UserAttrs")
    private List<AccountAttrs> userAttrs;
    public ImRemoveAttrRequest(String serviceName) {
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

    public ImRemoveAttrRequest setUserAttrs(List<AccountAttrs> userAttrs) {
        this.userAttrs = userAttrs;return this;
    }
    public ImRemoveAttrRequest setUserAttrs(AccountAttrs... userAttrs) {
        if (this.userAttrs==null){
            this.userAttrs=new ArrayList<>();
        }
        Collections.addAll(this.userAttrs,userAttrs);return this;
    }
}
