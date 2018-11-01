package core;

import com.alibaba.fastjson.JSON;
import core.api.*;
import core.enhance.Academy;
import request.openim.push.ImGetAttrRequest;
import response.ImGetAttrResponse;
import response.result.CoverResult;

public class TencentIMClient {

    private static ImOpenLoginSvc imOpenLoginSvc;
    private static RegistrationService registrationService;
    private static OpenIm openIm;
    private static GroupOpenHttpSvc groupOpenHttpSvc;
    private static OpenConfigSvr openConfigSvr;
    private static OpenimDirtyWords openimDirtyWords;
    private static OpenMsgSvc openMsgSvc;
    private static Profile profile;
    private static Sns sns;

    static {
        imOpenLoginSvc=Academy.requestEnhance(ImOpenLoginSvc.class);
        registrationService=Academy.requestEnhance(RegistrationService.class);
        openIm=Academy.requestEnhance(OpenIm.class);
        groupOpenHttpSvc=Academy.requestEnhance(GroupOpenHttpSvc.class);
        openConfigSvr=Academy.requestEnhance(OpenConfigSvr.class);
        openimDirtyWords=Academy.requestEnhance(OpenimDirtyWords.class);
        openMsgSvc=Academy.requestEnhance(OpenMsgSvc.class);
        profile=Academy.requestEnhance(Profile.class);
        sns=Academy.requestEnhance(Sns.class);

    }

    public TencentIMClient(String sdkappid,String identifier,String usersig) {
        TIMConfig.setSdkappid(sdkappid);
        TIMConfig.setIdentifier(identifier);
        TIMConfig.setUsersig(usersig);
    }


    public TencentIMClient(String sdkappid,String identifier,String usersig, String host,String ver,Boolean async) {
        TIMConfig.setSdkappid(sdkappid);
        TIMConfig.setIdentifier(identifier);
        TIMConfig.setUsersig(usersig);
        TIMConfig.setHost(host);
        TIMConfig.setVer(ver);
        TIMConfig.setAsync(async);
    }


    public TencentIMClient(String filePath) {
        TIMConfig.init(filePath);
    }

    public TencentIMClient() {
    }

    public Sns sns() {
        return sns;
    }

    public ImOpenLoginSvc imOpenLoginSvc() {
        return imOpenLoginSvc;
    }

    public RegistrationService registrationService() {
        return registrationService;
    }

    public OpenIm openIm() {
        return openIm;
    }

    public GroupOpenHttpSvc groupOpenHttpSvc() {
        return groupOpenHttpSvc;
    }

    public OpenConfigSvr openConfigSvr() {
        return openConfigSvr;
    }

    public OpenimDirtyWords openimDirtyWords() {
        return openimDirtyWords;
    }

    public OpenMsgSvc openMsgSvc() {
        return openMsgSvc;
    }

    public Profile profile() {
        return profile;
    }


}
