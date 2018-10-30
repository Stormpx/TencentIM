package request.imopenloginsvc;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import request.GeneralRequest;
import response.GeneralResponse;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
@Command("multiaccount_import")
public class MultiAccountImportRequest extends GeneralRequest<GeneralResponse> {
    @JSONField(name = "Accounts")
    private List<String> accounts;

    public MultiAccountImportRequest(String serviceName) {
        super(serviceName);
    }


    @Override
    public String checkParam() {
        if (accounts ==null|| accounts.isEmpty()){
            return "accounts";
        }
        return null;
    }

    public List<String> getAccounts() {
        return accounts;
    }

    public MultiAccountImportRequest setAccounts(List<String> accounts) {
        this.accounts = accounts;return this;
    }
    public MultiAccountImportRequest setAccounts(String... accounts) {
        if (this.accounts ==null){
            this.accounts=new LinkedList<>();
        }
        Collections.addAll(this.accounts ,accounts);
        return this;
    }
}
