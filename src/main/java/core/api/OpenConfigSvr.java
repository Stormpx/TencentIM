package core.api;

import annotation.ServiceName;
import core.enhance.Academy;
import request.openconfigsvr.GetNoSpeakingRequest;
import request.openconfigsvr.SetNoSpeakingRequest;

@ServiceName("openconfigsvr")
public class OpenConfigSvr {
    private final static String serviceName="openconfigsvr";
    public SetNoSpeakingRequest setNoSpeakingPrepare(){
        return (SetNoSpeakingRequest) Academy.requestEnhance(new SetNoSpeakingRequest(serviceName));
    }
    public GetNoSpeakingRequest getNoSpeakingPrepare(){
        return (GetNoSpeakingRequest) Academy.requestEnhance(new GetNoSpeakingRequest(serviceName));
    }
}
