package request.imopenloginsvc;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import exception.RequiredParamException;
import org.apache.commons.lang3.StringUtils;
import request.GeneralModel;
@Command("register_account_v1")
public class RegisterAccountV1 extends GeneralModel {
    @JSONField(name = "Identifier")
    private String identifier;
    @JSONField(name = "IdentifierType")
    private String identifierType;
    @JSONField(name = "Password")
    private String password;

    public RegisterAccountV1(String serviceName) {
        super(serviceName);
    }

    @Override
    public String checkParam() {
        if (StringUtils.isEmpty(identifier)) {
            return "identifier";
        } if (StringUtils.isEmpty(identifierType)) {
            return "identifierType";
        } if (StringUtils.isEmpty(password)) {
            return "password";
        } return null;
    }

    public String getIdentifier() {
        return identifier;
    }

    public RegisterAccountV1 setIdentifier(String identifier) {
        this.identifier = identifier;return this;
    }

    public String getIdentifierType() {
        return identifierType;
    }

    public RegisterAccountV1 setIdentifierType(String identifierType) {
        this.identifierType = identifierType;return this;
    }

    public String getPassword() {
        return password;
    }

    public RegisterAccountV1 setPassword(String password) {
        this.password = password;return this;
    }
}
