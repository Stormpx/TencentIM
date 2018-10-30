package request.imopenloginsvc;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import org.apache.commons.lang3.StringUtils;
import request.GeneralRequest;
@Command("kick")
public class KickRequest extends GeneralRequest {
    @JSONField(name = "Identifier")
    private String Identifier;

    public KickRequest(String serviceName) {
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

    public KickRequest setIdentifier(String identifier) {
        Identifier = identifier;return this;
    }
}
