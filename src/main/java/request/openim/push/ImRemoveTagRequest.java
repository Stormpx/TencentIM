package request.openim.push;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import model.UserTag;
import request.GeneralRequest;
import response.GeneralResponse;
import util.VariableUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Command("im_remove_tag")
public class ImRemoveTagRequest extends GeneralRequest<GeneralResponse> {
    @JSONField(name = "UserTags")
    private List<UserTag> userTags;


    @Override
    protected String checkParam() {
        if (VariableUtil.isEmpty(userTags)){
            return "UserTags";
        }
        return null;
    }

    public List<UserTag> getUserTags() {
        return userTags;
    }

    public ImRemoveTagRequest setUserTags(List<UserTag> userTags) {
        if (this.userTags!=null){
            this.userTags.addAll(userTags);
        }
        else{
            this.userTags = userTags;
        }
        return this;
    }
    public ImRemoveTagRequest setUserTags(UserTag... userTags) {
        if (this.userTags==null){
            this.userTags=new ArrayList<>();
        }
        Collections.addAll(this.userTags,userTags);
        return this;
    }

}
