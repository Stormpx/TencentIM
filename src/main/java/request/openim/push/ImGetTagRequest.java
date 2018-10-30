package request.openim.push;

import annotation.Command;
import request.GeneralRequest;
import response.ImGetTagResponse;
import util.VariableUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Command("im_get_tag")
public class ImGetTagRequest extends GeneralRequest<ImGetTagResponse> {
    private List<String> to_Account;

    public ImGetTagRequest(String serviceName) {
        super(serviceName);
    }

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
