package request.openim.line;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import request.GeneralRequest;
import response.QueryStateResponse;
import util.VariableUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Command("querystate")
public class QueryStateRequest extends GeneralRequest<QueryStateResponse> {
    @JSONField(name = "To_Account")
    private List<String> to_Account;


    @Override
    public String checkParam() {
        if (VariableUtil.isEmpty(to_Account)){
            return "To_Account";
        }
        return null;
    }



    public List<String> getTo_Account() {
        return to_Account;
    }

    public void setTo_Account(List<String> to_Account) {
        this.to_Account = to_Account;
    }
    public void setTo_Account(String... to_Account) {
        if (this.to_Account==null){
            this.to_Account=new ArrayList<>();
        }
        Collections.addAll(this.to_Account,to_Account);
    }
}
