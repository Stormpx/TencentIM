package request.openim.push;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import request.GeneralRequest;
import response.ImGetTagResponse;
import util.VariableUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Command("im_get_tag")
public class ImGetTagRequest extends GeneralRequest<ImGetTagResponse> {
    @JSONField(name = "To_Account")
    private List<String> to_Account;


    @Override
    protected String checkParam() {
        if (VariableUtil.isEmpty(to_Account)){
            return "To_Account";
        }
        return null;
    }



    public List<String> getTo_Account() {
        return to_Account;
    }

    public ImGetTagRequest setTo_Account(List<String> to_Account) {
        if (this.to_Account!=null){
            this.to_Account.addAll(to_Account);
        }else {
            this.to_Account = to_Account;
        }
        return this;
    }
    public ImGetTagRequest setTo_Account(String... to_Account) {
        if (this.to_Account==null){
            this.to_Account=new ArrayList<>();
        }
        Collections.addAll(this.to_Account,to_Account);return this;
    }
}
