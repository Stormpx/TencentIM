package core.api;
import annotation.ServiceName;
import core.enhance.Academy;
import request.imopenloginsvc.AccountImportRequest;
import request.imopenloginsvc.KickRequest;
import request.imopenloginsvc.MultiAccountImportRequest;

@ServiceName("im_open_login_svc")
public  class ImOpenLoginSvc {
    private final static String serviceName="im_open_login_svc";
    public AccountImportRequest accountImportPrepare(){
        return (AccountImportRequest) Academy.requestEnhance(new AccountImportRequest(serviceName));
    }
    public MultiAccountImportRequest multiaccountImportPrepare(){
        return (MultiAccountImportRequest) Academy.requestEnhance(new MultiAccountImportRequest(serviceName));
    }
    public KickRequest kickPrepare(){
        return(KickRequest) Academy.requestEnhance(new KickRequest(serviceName));
    }

}
