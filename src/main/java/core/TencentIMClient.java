package core;

import config.TencentImConfig;
import core.api.ImOpenLoginSvc;
import core.api.OpenIm;
import core.api.RegistrationService;
import request.imopenloginsvc.AccountImport;
import request.msgbody.TIMMsgElement;
import request.msgbody.TextElem;
import request.openim.line.QueryState;
import request.openim.msg.SendMsg;
import response.CoverResult;
import response.GeneralResponse;
import util.MsgType;

public class TencentIMClient {
    private ImOpenLoginSvc imOpenLoginSvc=new ImOpenLoginSvc();
    private RegistrationService registrationService=new RegistrationService();
    private OpenIm openIm=new OpenIm();
    TencentIMClient(){
        TencentImConfig.init();
    }
    public ImOpenLoginSvc imOpenLoginSvc() {
        return imOpenLoginSvc;
    }
    public RegistrationService registrationService(){
        return registrationService;
    }
    public OpenIm openIm(){
        return openIm;
    }

    public static void main(String[] args) {
        TencentIMClient tencentIMClient = new TencentIMClient();
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
