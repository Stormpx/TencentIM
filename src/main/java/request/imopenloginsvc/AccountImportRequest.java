package request.imopenloginsvc;


import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import org.apache.commons.lang3.StringUtils;
import request.GeneralRequest;
import response.GeneralResponse;

@Command("account_import")
public class AccountImportRequest extends GeneralRequest<GeneralResponse> {
    @JSONField(name = "Identifier")
    private String Identifier;
    @JSONField(name = "Nick")
    private String Nick;
    @JSONField(name = "FaceUrl")
    private String FaceUrl;
    private Integer Type;

    public AccountImportRequest(String serviceName) {
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

    public AccountImportRequest setIdentifier(String identifier) {
        Identifier = identifier;return this;
    }

    public String getNick() {
        return Nick;
    }

    public AccountImportRequest setNick(String nick) {
        Nick = nick;return this;
    }

    public String getFaceUrl() {
        return FaceUrl;
    }

    public AccountImportRequest setFaceUrl(String faceUrl) {
        FaceUrl = faceUrl;return this;
    }

    public Integer getType() {
        return Type;
    }

    public AccountImportRequest setType(Integer type) {
        Type = type;return this;
    }
}
