package core.api;

import annotation.ServiceName;
import core.enhance.Academy;
import request.openimdirtywords.DirtyWordsAddRequest;
import request.openimdirtywords.DirtyWordsDeleteRequest;
import request.openimdirtywords.DirtyWordsGetRequest;

@ServiceName("openim_dirty_words")
public class OpenimDirtyWords {
    private final static String serviceName="openim_dirty_words";

    public DirtyWordsGetRequest getPrepare(){
        return (DirtyWordsGetRequest) Academy.requestEnhance(new DirtyWordsGetRequest(serviceName));
    }

    public DirtyWordsAddRequest addPrepare(){
        return (DirtyWordsAddRequest) Academy.requestEnhance(new DirtyWordsAddRequest(serviceName));
    }
    public DirtyWordsDeleteRequest deletePrepare(){
        return (DirtyWordsDeleteRequest) Academy.requestEnhance(new DirtyWordsDeleteRequest(serviceName));
    }
}
