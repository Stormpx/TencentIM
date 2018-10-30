package response;

import com.alibaba.fastjson.JSONObject;

import java.util.List;
import java.util.Map;

public class ImGetAttrNameResponse extends GeneralResponse{
    private Map<String,String> AttrNames;

    public Map<String, String> getAttrNames() {
        return AttrNames;
    }

    public void setAttrNames(Map<String, String> attrNames) {
        AttrNames = attrNames;
    }
}
