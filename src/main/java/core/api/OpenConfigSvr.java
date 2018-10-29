package core.api;

import annotation.ServiceName;
import core.enhance.Academy;
import request.openconfigsvr.GetNoSpeaking;
import request.openconfigsvr.SetNoSpeaking;

@ServiceName("openconfigsvr")
public class OpenConfigSvr {
    private final static String serviceName="openconfigsvr";
    public SetNoSpeaking setNoSpeakingPrepare(){
        return (SetNoSpeaking) Academy.requestEnhance(new SetNoSpeaking(serviceName));
    }
    public GetNoSpeaking getNoSpeakingPrepare(){
        return (GetNoSpeaking) Academy.requestEnhance(new GetNoSpeaking(serviceName));
    }
}
