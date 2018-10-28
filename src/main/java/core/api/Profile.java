package core.api;

import annotation.ServiceName;
import core.enhance.Academy;
import request.profile.PortraitGet;
import request.profile.PortraitSet;

@ServiceName("profile")
public class Profile  {
    private final static String serviceName="profile";
    public PortraitGet portraitGetPrepare(){
        return (PortraitGet) Academy.requestEnhance(new PortraitGet(serviceName));
    }
    public PortraitSet portraitSetPrepare(){
        return (PortraitSet) Academy.requestEnhance(new PortraitSet(serviceName));
    }
}
