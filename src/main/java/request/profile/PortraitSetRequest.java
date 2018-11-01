package request.profile;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import model.ProfileTag;
import request.GeneralRequest;
import response.GeneralResponse;
import util.VariableUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Command("portrait_set")
public class PortraitSetRequest extends GeneralRequest<GeneralResponse> {
    @JSONField(name = "From_Account")
    private String fromAccount;
    @JSONField(name = "ProfileItem")
    private List<ProfileTag> profileItem;

    @Override
    protected String checkParam() {
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

    public PortraitSetRequest setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;return this;
    }

    public List<ProfileTag> getProfileItem() {
        return profileItem;
    }

    public PortraitSetRequest setProfileItem(List<ProfileTag> profileItem) {
        if (this.profileItem!=null){
            this.profileItem.addAll(profileItem);
        }else{
        this.profileItem = profileItem;}
        return this;
    }

    public PortraitSetRequest setProfileItem(ProfileTag... profileItem) {
        if (this.profileItem==null){
            this.profileItem=new ArrayList<>();
        }
        Collections.addAll(this.profileItem,profileItem);
        return this;
    }
}
