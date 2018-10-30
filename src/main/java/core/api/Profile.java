package core.api;

import annotation.ServiceName;
import core.enhance.Academy;
import request.profile.PortraitGetRequest;
import request.profile.PortraitSetRequest;

@ServiceName("profile")
public class Profile  {
    private final static String serviceName="profile";
    public PortraitGetRequest portraitGetPrepare(){
        return (PortraitGetRequest) Academy.requestEnhance(new PortraitGetRequest(serviceName));
    }
    public PortraitSetRequest portraitSetPrepare(){
        return (PortraitSetRequest) Academy.requestEnhance(new PortraitSetRequest(serviceName));
    }
}
