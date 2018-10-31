package request.openim.push;

import annotation.Command;
import request.GeneralRequest;
import response.ImGetAttrNameResponse;

@Command("im_get_attr_name")
public class ImGetAttrNameRequest extends GeneralRequest<ImGetAttrNameResponse> {

    public ImGetAttrNameRequest(String serviceName) {
        super(serviceName);
    }

    @Override
    protected String checkParam() {
        return null;
    }
}
