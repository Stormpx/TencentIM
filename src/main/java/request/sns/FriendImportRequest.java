package request.sns;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import model.FriendItem;
import response.FriendImportResponse;
import util.VariableUtil;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@Command("friend_import")
public class FriendImportRequest extends SnsRequest<FriendImportResponse> {
    @JSONField(name = "AddFriendItem")
    private List<FriendItem> addFriendItem;
    public FriendImportRequest(String serviceName) {
        super(serviceName);
    }

    @Override
    protected String check() {
        if (VariableUtil.isEmpty(addFriendItem)){
            return "AddFriendItem";
        }
        return null;
    }

    public List<FriendItem> getAddFriendItem() {
        return addFriendItem;
    }

    public FriendImportRequest setAddFriendItem(List<FriendItem> addFriendItem) {
        this.addFriendItem = addFriendItem;return this;
    }

    public FriendImportRequest setAddFriendItem(FriendItem... addFriendItem) {
        if (this.addFriendItem==null){
            this.addFriendItem=new LinkedList<>();
        }
        Collections.addAll(this.addFriendItem,addFriendItem);
        return this;
    }
    public FriendImportRequest setFromAccount(String fromAccount) {
        super.fromAccount = fromAccount;
        return this;
    }
}
