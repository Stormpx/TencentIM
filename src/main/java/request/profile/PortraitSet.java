package request.profile;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import model.ProfileTag;
import request.GeneralModel;
import util.VariableUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Command("portrait_set")
public class PortraitSet extends GeneralModel {
    @JSONField(name = "From_Account")
    private String fromAccount;
    @JSONField(name = "ProfileItem")
    private List<ProfileTag> profileItem;
    public PortraitSet(String serviceName) {
        super(serviceName);
    }

    @Override
    public String checkParam() {
        if (VariableUtil.isEmpty(fromAccount)){
            return "From_Account";
        }
        if (VariableUtil.isEmpty(profileItem)){
            return "ProfileItem";
        }
        return null;
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public PortraitSet setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;return this;
    }

    public List<ProfileTag> getProfileItem() {
        return profileItem;
    }

    public PortraitSet setProfileItem(List<ProfileTag> profileItem) {
        this.profileItem = profileItem;return this;
    }

    public PortraitSet setProfileItem(ProfileTag... profileItem) {
        if (this.profileItem==null){
            this.profileItem=new ArrayList<>();
        }
        Collections.addAll(this.profileItem,profileItem);
        return this;
    }
}
