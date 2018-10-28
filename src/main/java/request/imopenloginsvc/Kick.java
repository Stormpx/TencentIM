package request.imopenloginsvc;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import exception.RequiredParamException;
import org.apache.commons.lang3.StringUtils;
import request.GeneralModel;
@Command("kick")
public class Kick extends GeneralModel {
    @JSONField(name = "Identifier")
    private String Identifier;

    public Kick(String serviceName) {
        super(serviceName);
    }

    @Override
    public String checkParam() {
        if (StringUtils.isEmpty(Identifier)){
            return  "Identifier";
        }
        return null;
    }

    public String getIdentifier() {
        return Identifier;
    }

    public Kick setIdentifier(String identifier) {
        Identifier = identifier;return this;
    }
}
