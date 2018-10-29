package request.sns;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import model.UpdateItem;
import util.VariableUtil;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@Command("friend_update")
public class FriendUpdate extends SnsModel {
    @JSONField(name = "UpdateItem")
    private List<UpdateItem> updateItem;
    public FriendUpdate(String serviceName) {
        super(serviceName);
    }

    @Override
    protected String check() {
        if (VariableUtil.isEmpty(updateItem)) {
            return "UpdateItem";
        }
        return null;
    }

    public List<UpdateItem> getUpdateItem() {
        return updateItem;
    }

    public FriendUpdate setUpdateItem(List<UpdateItem> updateItem) {
        this.updateItem = updateItem;return this;
    }

    public FriendUpdate setUpdateItem(UpdateItem... updateItem) {
        if (this.updateItem==null){
            this.updateItem=new LinkedList<>();
        }
        Collections.addAll(this.updateItem,updateItem);
        return this;
    }
    public FriendUpdate setFromAccount(String fromAccount) {
        super.fromAccount = fromAccount;
        return this;
    }
}
