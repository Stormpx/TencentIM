package response;

import com.alibaba.fastjson.JSONObject;
import model.AccountAttrs;

import java.util.List;

public class ImGetAttrResponse {
    private List<AccountAttrs> userAttrs;

    public List<AccountAttrs> getUserAttrs() {
        return userAttrs;
    }

    public void setUserAttrs(List<AccountAttrs> userAttrs) {
        this.userAttrs = userAttrs;
    }
}
