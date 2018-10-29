package response;

import com.alibaba.fastjson.JSONObject;
import model.UserTag;

import java.util.List;

public class ImGetTagResponse {
    private List<UserTag> UserTags;

    public List<UserTag> getUserTags() {
        return UserTags;
    }

    public void setUserTags(List<UserTag> userTags) {
        UserTags = userTags;
    }

}
