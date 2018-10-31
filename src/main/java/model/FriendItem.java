package model;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class FriendItem {
    @JSONField(name = "To_Account")
    private String toAccount;
    @JSONField(name = "Remark")
    private String remark;
    @JSONField(name = "RemarkTime")
    private String remarkTime;
    @JSONField(name = "GroupName")
    private String groupName;
    @JSONField(name = "AddSource")
    private String addSource;
    @JSONField(name = "AddWording")
    private String addWording;
    @JSONField(name = "AddTime")
    private String addTime;
    @JSONField(name = "CustomItem")
    private List<CustomItem> customItems;
    public FriendItem setToAccount(String toAccount) {
        this.toAccount = toAccount;return this;
    }

    public FriendItem setRemark(String remark) {
        this.remark = remark;return this;
    }


    public FriendItem setAddSource(String addSource) {
        this.addSource = "AddSource_Type_"+addSource;
        return this;
    }

    public FriendItem setAddWording(String addWording) {
        this.addWording = addWording;return this;
    }

    public FriendItem setRemarkTime(String remarkTime) {
        this.remarkTime = remarkTime;return this;
    }

    public FriendItem setGroupName(String groupName) {
        this.groupName = groupName;return this;
    }

    public FriendItem setCustomItems(List<CustomItem> customItems) {
        this.customItems = customItems;return this;
    }
    public FriendItem setCustomItems(CustomItem... customItems) {
        if (this.customItems==null){
            this.customItems=new LinkedList<>();
        }
        Collections.addAll(this.customItems,customItems);
        return this;
    }

    public String getAddTime() {
        return addTime;
    }

    public FriendItem setAddTime(String addTime) {
        this.addTime = addTime;return this;
    }

    public String getToAccount() {
        return toAccount;
    }

    public String getRemark() {
        return remark;
    }


    public String getAddSource() {
        return addSource;
    }

    public String getAddWording() {
        return addWording;
    }
}
