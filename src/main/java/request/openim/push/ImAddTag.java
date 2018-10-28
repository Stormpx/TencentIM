package request.openim.push;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import model.UserTag;
import request.GeneralModel;
import util.VariableUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Command("im_add_tag")
public class ImAddTag extends GeneralModel {
    @JSONField(name = "UserTags")
    private List<UserTag> userTags;

    public ImAddTag(String serviceName) {
        super(serviceName);
    }

    @Override
    public String checkParam() {
        if (VariableUtil.isEmpty(userTags)){
            return "UserTags";
        }
        return null;
    }

    public List<UserTag> getUserTags() {
        return userTags;
    }

    public ImAddTag setUserTags(List<UserTag> userTags) {
        this.userTags = userTags;return this;
    }
    public ImAddTag setUserTags(UserTag... userTags) {
        if (this.userTags==null){
            this.userTags=new ArrayList<>();
        }
        Collections.addAll(this.userTags,userTags);return this;
    }


}
