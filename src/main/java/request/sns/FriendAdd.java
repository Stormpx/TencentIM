package request.sns;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import model.FriendItem;
import request.GeneralModel;
import util.VariableUtil;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@Command("friend_add")
public class FriendAdd extends SnsModel {
    @JSONField(name = "AddFriendItem")
    private List<FriendItem> addFriendItem;
    /*"Add_Type_Single" 表示单向加好友；
        "Add_Type_Both" 表示双向加好友。
    * */
    @JSONField(name = "AddType")
    private String addType;
    //1 表示强制加好友；0 表示常规加好友方式。
    @JSONField(name = "ForceAddFlags")
    private Integer forceAddFlags;
    public FriendAdd(String serviceName) {
        super(serviceName);
    }

    @Override
    protected String check() {
        if (VariableUtil.isEmpty(addFriendItem)){
            return "AddFriendItem";
        }
        return null;
    }

    public String getAddType() {
        return addType;
    }
    public List<FriendItem> getAddFriendItem() {
        return addFriendItem;
    }

    public Integer getForceAddFlags() {
        return forceAddFlags;
    }
    public FriendAdd setAddType(String addType) {
        this.addType = addType;return this;
    }

    public FriendAdd setFromAccount(String fromAccount) {
        super.fromAccount = fromAccount;
        return this;
    }

    public FriendAdd setAddFriendItem(List<FriendItem> addFriendItem) {
        this.addFriendItem = addFriendItem;return this;
    }
    public FriendAdd setAddFriendItem(FriendItem... addFriendItem) {
        if (this.addFriendItem==null){
            this.addFriendItem=new LinkedList<>();
        }
        Collections.addAll(this.addFriendItem,addFriendItem);
        return this;
    }
    public FriendAdd setForceAddFlags(Integer forceAddFlags) {
        this.forceAddFlags = forceAddFlags;return this;
    }


}
