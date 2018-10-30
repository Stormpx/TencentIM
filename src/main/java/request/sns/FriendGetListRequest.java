package request.sns;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import response.FriendGetListResponse;
import util.VariableUtil;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@Command("friend_get_list")
public class FriendGetListRequest extends SnsRequest<FriendGetListResponse> {
    @JSONField(name = "To_Account")
    private List<String> toAccount;
    @JSONField(name = "TagList")
    private List<String> tagList;

    public FriendGetListRequest(String serviceName) {
        super(serviceName);
    }

    @Override
    protected String check() {
        if (VariableUtil.isEmpty(toAccount)){
            return "To_Account";
        }
        return null;
    }
    public FriendGetListRequest setToAccount(List<String> toAccount) {
        this.toAccount = toAccount;return this;
    }

    public FriendGetListRequest setToAccount(String... toAccount) {
        if (this.toAccount==null){
            this.toAccount=new LinkedList<>();
        }
        Collections.addAll(this.toAccount,toAccount);
        return this;
    }

    public FriendGetListRequest setTagList(List<String> tagList) {
        this.tagList = tagList;return this;
    }
    public FriendGetListRequest setTagList(String... tagList) {
        if (this.tagList==null){
            this.tagList=new LinkedList<>();
        }
        Collections.addAll(this.tagList ,tagList);
        return this;
    }
    public FriendGetListRequest setFromAccount(String fromAccount) {
        super.fromAccount = fromAccount;
        return this;
    }
    public List<String> getToAccount() {
        return toAccount;
    }

    public List<String> getTagList() {
        return tagList;
    }
}
