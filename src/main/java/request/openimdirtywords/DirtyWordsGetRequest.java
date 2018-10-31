package request.openimdirtywords;

import annotation.Command;
import request.GeneralRequest;
import response.DirtyWordsGetResponse;

@Command("get")
public class DirtyWordsGetRequest extends GeneralRequest<DirtyWordsGetResponse> {
    public DirtyWordsGetRequest(String serviceName) {
        super(serviceName);
    }

    @Override
    protected String checkParam() {
        return null;
    }
}
