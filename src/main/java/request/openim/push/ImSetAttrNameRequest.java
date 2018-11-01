package request.openim.push;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import request.GeneralRequest;
import response.GeneralResponse;
import util.VariableUtil;

import java.util.Map;

@Command("im_set_attr_name")
public class ImSetAttrNameRequest extends GeneralRequest<GeneralResponse> {
    @JSONField(name = "AttrNames")
    private Map<String,String> attrNames;


    @Override
    protected String checkParam() {
        if (VariableUtil.isEmpty(attrNames)){
            return "AttrNames";
        }
        return null;
    }

    public Map<String, String> getAttrNames() {
        return attrNames;
    }

    public ImSetAttrNameRequest setAttrNames(Map<String, String> attrNames) {
        this.attrNames = attrNames;return this;
    }
}
