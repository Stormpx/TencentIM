package core;

import com.alibaba.fastjson.JSON;
import config.TencentImConfig;
import core.api.*;
import request.openim.push.ImGetAttrRequest;
import response.ImGetAttrResponse;
import response.result.CoverResult;

public class TencentIMClient {

    private static ImOpenLoginSvc imOpenLoginSvc = new ImOpenLoginSvc();
    private static RegistrationService registrationService = new RegistrationService();
    private static OpenIm openIm = new OpenIm();
    private static GroupOpenHttpSvc groupOpenHttpSvc = new GroupOpenHttpSvc();
    private static OpenConfigSvr openConfigSvr = new OpenConfigSvr();
    private static OpenimDirtyWords openimDirtyWords = new OpenimDirtyWords();
    private static OpenMsgSvc openMsgSvc = new OpenMsgSvc();
    private static Profile profile = new Profile();
    private static Sns sns = new Sns();

    public TencentIMClient(String filePath) {
        TencentImConfig.init(filePath);
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
