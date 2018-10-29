package request.openimdirtywords;

import annotation.Command;
import request.GeneralModel;

@Command("get")
public class Get extends GeneralModel {
    public Get(String serviceName) {
        super(serviceName);
    }

    @Override
    public String checkParam() {
        return null;
    }
}
