package core;

import config.TencentImConfig;
import core.api.*;
import request.imopenloginsvc.MultiAccountImportRequest;
import request.msgbody.TIMMsgElement;
import request.msgbody.TextElem;
import request.openim.msg.BatchSendMsgRequest;
import request.openim.msg.SendMsgRequest;
import request.openim.push.ImportMsgRequest;
import response.BatchSendMsgResponse;
import response.result.CoverResult;
import response.GeneralResponse;
import util.MsgType;

import java.util.Date;

public class TencentIMClient {

    private static ImOpenLoginSvc imOpenLoginSvc = new ImOpenLoginSvc();
    private static RegistrationService registrationService = new RegistrationService();
    private static OpenIm openIm = new OpenIm();
    private static GroupOpenHttpSvc groupOpenHttpSvc=new GroupOpenHttpSvc();
    private static OpenConfigSvr openConfigSvr=new OpenConfigSvr();
    private static OpenimDirtyWords openimDirtyWords=new OpenimDirtyWords();
    private static OpenMsgSvc openMsgSvc=new OpenMsgSvc();
    private static Profile profile=new Profile();
    private static Sns sns=new Sns();

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









        /*ImportMsgRequest importMsgRequest = tencentIMClient.openIm().importMsgPrepare();
        importMsgRequest.setSyncOtherMachine(2)
                        .setFromAccount("547426153")
                        .setToAccount("user2")
                        .setMsgTimeStamp(System.currentTimeMillis()/1000)
                        .setMsgBody(new TIMMsgElement().setMsgType(MsgType.TIMTEXTELEM)
                                                        .setMsgContent(new TextElem()
                                                                .setText("ganjinhuiwo")));
        CoverResult<GeneralResponse> result = importMsgRequest.execute();
        GeneralResponse generalResponse = result.get();
        System.out.println(generalResponse);*/








        /*BatchSendMsgRequest batchSendMsgRequest = tencentIMClient.openIm().batchSendMsgPrepare();
        batchSendMsgRequest.setSyncOtherMachine(1)
                            .setTo_Account("user1","user2","user3","user4")
                            .setMsgBody(new TIMMsgElement().setMsgType(MsgType.TIMTEXTELEM)
                                                            .setMsgContent(new TextElem().setText("hello")),
                                        new TIMMsgElement().setMsgType(MsgType.TIMTEXTELEM)
                                                            .setMsgContent(new TextElem().setText("call me")));
        CoverResult<BatchSendMsgResponse> result = batchSendMsgRequest.execute();
        BatchSendMsgResponse batchSendMsgResponse = result.get();
        System.out.println(batchSendMsgResponse);*/


        /*MultiAccountImportRequest multiAccountImportRequest = tencentIMClient.imOpenLoginSvc().multiaccountImportPrepare();
        CoverResult<GeneralResponse> result = multiAccountImportRequest.setAccounts("18028597388", "user1", "user2", "user3", "user4").execute();
        GeneralResponse generalResponse = result.get();
        System.out.println(generalResponse);*/
    }
}
