package core.api;

import annotation.ServiceName;
import core.enhance.Academy;
import request.groupopenhttpsvc.GroupMsgGetSimple;
import request.openimdirtywords.Add;
import request.openimdirtywords.Delete;
import request.openimdirtywords.Get;

@ServiceName("openim_dirty_words")
public class OpenimDirtyWords {
    private final static String serviceName="openim_dirty_words";

    public Get getPrepare(){
        return (Get) Academy.requestEnhance(new Get(serviceName));
    }

    public Add addPrepare(){
        return (Add) Academy.requestEnhance(new Add(serviceName));
    }
    public Delete deletePrepare(){
        return (Delete) Academy.requestEnhance(new Delete(serviceName));
    }
}
