package request.openim.push;

import annotation.Command;
import request.GeneralModel;
@Command("im_get_attr_name")
public class ImGetAttrName extends GeneralModel {

    public ImGetAttrName(String serviceName) {
        super(serviceName);
    }

    @Override
    public String checkParam() {
        return null;
    }
}
