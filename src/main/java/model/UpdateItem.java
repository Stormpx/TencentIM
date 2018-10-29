package model;

import com.alibaba.fastjson.annotation.JSONField;
import core.api.Sns;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class UpdateItem {
    @JSONField(name = "To_Account")
    private String toAccount;
    @JSONField(name = "SnsItem")
    private List<SnsItem> snsItems;

    public String getToAccount() {
        return toAccount;
    }

    public UpdateItem setToAccount(String toAccount) {
        this.toAccount = toAccount;return this;
    }

    public List<SnsItem> getSnsItems() {
        return snsItems;
    }

    public UpdateItem setSnsItems(List<SnsItem> snsItems) {
        this.snsItems = snsItems;return this;
    }

    public UpdateItem setSnsItems(SnsItem... snsItems) {
        if (this.snsItems==null){
            this.snsItems=new LinkedList<>();
        }
        Collections.addAll(this.snsItems,snsItems);
        return this;
    }
}
