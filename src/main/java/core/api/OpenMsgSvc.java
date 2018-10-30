package core.api;

import annotation.ServiceName;
import core.enhance.Academy;
import request.openmsgsvc.GetHistoryRequest;

@ServiceName("open_msg_svc")
public class OpenMsgSvc {
    private final static String serviceName="open_msg_svc";
    public GetHistoryRequest getHistoryPrepare(){
        return (GetHistoryRequest) Academy.requestEnhance(new GetHistoryRequest(serviceName));
    }
}
