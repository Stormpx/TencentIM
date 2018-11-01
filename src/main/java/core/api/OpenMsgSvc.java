package core.api;

import annotation.ServiceName;
import core.enhance.Academy;
import request.openmsgsvc.GetHistoryRequest;

@ServiceName("open_msg_svc")
public class OpenMsgSvc {

    public GetHistoryRequest getHistoryPrepare(){
        return new GetHistoryRequest();
    }
}
