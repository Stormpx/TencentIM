package request.sns;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import response.BlackListAddResponse;
import util.VariableUtil;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@Command("black_list_add")
public class BlackListAddRequest extends SnsRequest<BlackListAddResponse> {
    @JSONField(name = "To_Account")
    private List<String> toAccount;


    @Override
    protected String check() {
        if (VariableUtil.isEmpty(toAccount)){
            return "To_Account";
        }
        return null;
    }

    public BlackListAddRequest setToAccount(List<String> toAccount) {
        this.toAccount = toAccount;return this;
    }

    public BlackListAddRequest setToAccount(String... toAccount) {
        if (this.toAccount==null){
            this.toAccount=new LinkedList<>();
        }
        Collections.addAll(this.toAccount,toAccount);
        return this;
    }
    public BlackListAddRequest setFromAccount(String fromAccount) {
        super.fromAccount = fromAccount;
        return this;
    }
    public List<String> getToAccount() {
        return toAccount;
    }
}
