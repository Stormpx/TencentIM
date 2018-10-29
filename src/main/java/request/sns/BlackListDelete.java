package request.sns;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import util.VariableUtil;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@Command("black_list_delete")
public class BlackListDelete extends SnsModel{
    @JSONField(name = "To_Account")
    private List<String> toAccount;
    public BlackListDelete(String serviceName) {
        super(serviceName);
    }

    @Override
    protected String check() {
        if (VariableUtil.isEmpty(toAccount)){
            return "To_Account";
        }
        return null;
    }

    public BlackListDelete setToAccount(List<String> toAccount) {
        this.toAccount = toAccount;return this;
    }

    public BlackListDelete setToAccount(String... toAccount) {
        if (this.toAccount==null){
            this.toAccount=new LinkedList<>();
        }
        Collections.addAll(this.toAccount,toAccount);
        return this;
    }

    public List<String> getToAccount() {
        return toAccount;
    }
}
