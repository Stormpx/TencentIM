package request.openimdirtywords;

import annotation.Command;
import request.GeneralRequest;
import response.DirtyWordsGetResponse;

@Command("get")
public class DirtyWordsGetRequest extends GeneralRequest<DirtyWordsGetResponse> {

    @Override
    protected String checkParam() {
        return null;
    }
}
