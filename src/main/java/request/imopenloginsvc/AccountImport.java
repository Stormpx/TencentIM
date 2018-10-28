package request.imopenloginsvc;


import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import exception.RequiredParamException;
import org.apache.commons.lang3.StringUtils;
import request.GeneralModel;

@Command("account_import")
public class AccountImport extends GeneralModel {
    @JSONField(name = "Identifier")
    private String Identifier;
    @JSONField(name = "Nick")
    private String Nick;
    @JSONField(name = "FaceUrl")
    private String FaceUrl;
    private Integer Type;

    public AccountImport(String serviceName) {
        super(serviceName);
    }


    @Override
    public String checkParam() {
        if (StringUtils.isEmpty(Identifier)) {
            return "Identifier";
        } return null;
    }


    public String getIdentifier() {
        return Identifier;
    }

    public AccountImport setIdentifier(String identifier) {
        Identifier = identifier;return this;
    }

    public String getNick() {
        return Nick;
    }

    public AccountImport setNick(String nick) {
        Nick = nick;return this;
    }

    public String getFaceUrl() {
        return FaceUrl;
    }

    public AccountImport setFaceUrl(String faceUrl) {
        FaceUrl = faceUrl;return this;
    }

    public Integer getType() {
        return Type;
    }

    public AccountImport setType(Integer type) {
        Type = type;return this;
    }
}
