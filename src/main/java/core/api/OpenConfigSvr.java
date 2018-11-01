package core.api;

import annotation.ServiceName;
import core.enhance.Academy;
import request.openconfigsvr.GetNoSpeakingRequest;
import request.openconfigsvr.SetNoSpeakingRequest;

@ServiceName("openconfigsvr")
public class OpenConfigSvr {
    public SetNoSpeakingRequest setNoSpeakingPrepare(){
        return new SetNoSpeakingRequest();
    }
    public GetNoSpeakingRequest getNoSpeakingPrepare(){
        return new GetNoSpeakingRequest();
    }
}
