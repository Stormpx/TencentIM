package request.openim.push;

import annotation.Command;
import request.GeneralRequest;
@Command("im_get_attr_name")
public class ImGetAttrName extends GeneralRequest {

    public ImGetAttrName(String serviceName) {
        super(serviceName);
    }

    @Override
    public String checkParam() {
        return null;
    }
}
