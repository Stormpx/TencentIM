package request.openim.push;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import request.GeneralModel;
import util.VariableUtil;

import java.util.Map;

@Command("im_set_attr_name")
public class ImSetAttrName extends GeneralModel{
    @JSONField(name = "AttrNames")
    private Map<String,String> attrNames;

    public ImSetAttrName(String serviceName) {
        super(serviceName);
    }

    @Override
    public String checkParam() {
        if (VariableUtil.isEmpty(attrNames)){
            return "AttrNames";
        }
        return null;
    }

    public Map<String, String> getAttrNames() {
        return attrNames;
    }

    public ImSetAttrName setAttrNames(Map<String, String> attrNames) {
        this.attrNames = attrNames;return this;
    }
}
