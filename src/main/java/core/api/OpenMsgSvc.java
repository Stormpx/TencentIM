package core.api;

import annotation.ServiceName;
import core.enhance.Academy;
import request.openconfigsvr.GetNoSpeaking;
import request.openmsgsvc.GetHistory;

@ServiceName("open_msg_svc")
public class OpenMsgSvc {
    private final static String serviceName="open_msg_svc";
    public GetHistory getHistoryPrepare(){
        return (GetHistory) Academy.requestEnhance(new GetHistory(serviceName));
    }
}
