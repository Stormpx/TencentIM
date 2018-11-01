package core.api;

import annotation.ServiceName;
import core.enhance.Academy;
import request.profile.PortraitGetRequest;
import request.profile.PortraitSetRequest;

@ServiceName("profile")
public class Profile  {

    public PortraitGetRequest portraitGetPrepare(){
        return new PortraitGetRequest();
    }
    public PortraitSetRequest portraitSetPrepare(){
        return new PortraitSetRequest();
    }
}
