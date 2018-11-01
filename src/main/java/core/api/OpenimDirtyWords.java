package core.api;

import annotation.ServiceName;
import core.enhance.Academy;
import request.openimdirtywords.DirtyWordsAddRequest;
import request.openimdirtywords.DirtyWordsDeleteRequest;
import request.openimdirtywords.DirtyWordsGetRequest;

@ServiceName("openim_dirty_words")
public class OpenimDirtyWords {


    public DirtyWordsGetRequest getPrepare(){
        return new DirtyWordsGetRequest();
    }

    public DirtyWordsAddRequest addPrepare(){
        return new DirtyWordsAddRequest();
    }
    public DirtyWordsDeleteRequest deletePrepare(){
        return new DirtyWordsDeleteRequest();
    }
}
