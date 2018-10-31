package request.sns;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import response.BlackListDeleteResponse;
import util.VariableUtil;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@Command("black_list_delete")
public class BlackListDeleteRequest extends SnsRequest<BlackListDeleteResponse> {
    @JSONField(name = "To_Account")
    private List<String> toAccount;
    public BlackListDeleteRequest(String serviceName) {
        super(serviceName);
    }

    @Override
    protected String check() {
        if (VariableUtil.isEmpty(toAccount)){
            return "To_Account";
        }
        return null;
    }

    public BlackListDeleteRequest setFromAccount(String fromAccount) {
        super.fromAccount = fromAccount;
        return this;
    }

    public BlackListDeleteRequest setToAccount(List<String> toAccount) {
        this.toAccount = toAccount;return this;
    }

    public BlackListDeleteRequest setToAccount(String... toAccount) {
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
