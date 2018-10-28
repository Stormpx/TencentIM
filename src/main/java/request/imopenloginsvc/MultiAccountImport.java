package request.imopenloginsvc;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import request.GeneralModel;

import java.util.List;
@Command("multiaccount_import")
public class MultiAccountImport extends GeneralModel {
    @JSONField(name = "Accounts")
    private List<String> accounts;

    public MultiAccountImport(String serviceName) {
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

    public MultiAccountImport setAccounts(List<String> accounts) {
        this.accounts = accounts;return this;
    }
}
