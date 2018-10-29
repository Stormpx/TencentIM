package core;

import config.TencentImConfig;
import core.api.*;
import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import request.imopenloginsvc.AccountImport;
import request.msgbody.TIMMsgElement;
import request.msgbody.TextElem;
import request.openim.line.QueryState;
import request.openim.msg.SendMsg;
import response.CoverResult;
import response.GeneralResponse;
import util.MsgType;

public class TencentIMClient {

    private ImOpenLoginSvc imOpenLoginSvc = new ImOpenLoginSvc();
    private RegistrationService registrationService = new RegistrationService();
    private OpenIm openIm = new OpenIm();
    private GroupOpenHttpSvc groupOpenHttpSvc=new GroupOpenHttpSvc();
    private OpenConfigSvr openConfigSvr=new OpenConfigSvr();
    private OpenimDirtyWords openimDirtyWords=new OpenimDirtyWords();
    private OpenMsgSvc openMsgSvc=new OpenMsgSvc();
    private Profile profile=new Profile();
    private Sns sns=new Sns();

    public TencentIMClient(String filePath) {

        TencentImConfig.init(filePath);
    }

    public TencentIMClient() {
    }

    public Sns sns(){
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

    public static void main(String[] args) {
        TencentIMClient tencentIMClient = new TencentIMClient("tencentIm.properties");
        SendMsg sendMsg = tencentIMClient.openIm().sendMsgPrepare();
        sendMsg.setSyncOtherMachine(1)
                .setFrom_Account("547426153")
                .setTo_Account("19927598517")
                .setMsgBody(new TIMMsgElement().setMsgType(MsgType.TIMTEXTELEM)
                                                .setMsgContent(new TextElem()
                                                .setText("hello")));

        CoverResult result = sendMsg.execute();
        GeneralResponse generalResponse = result.get();
        System.out.println(generalResponse);
    }
}
