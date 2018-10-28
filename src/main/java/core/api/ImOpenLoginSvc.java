package core.api;
import annotation.ServiceName;
import core.enhance.Academy;
import request.imopenloginsvc.AccountImport;
import request.imopenloginsvc.Kick;
import request.imopenloginsvc.MultiAccountImport;
import request.imopenloginsvc.RegisterAccountV1;

@ServiceName("im_open_login_svc")
public  class ImOpenLoginSvc {
    private final static String serviceName="im_open_login_svc";
    public  AccountImport accountImportPrepare(){
        return (AccountImport) Academy.requestEnhance(new AccountImport(serviceName));
    }
    public MultiAccountImport multiaccountImportPrepare(){
        return (MultiAccountImport) Academy.requestEnhance(new MultiAccountImport(serviceName));
    }
    public Kick kickPrepare(){
        return(Kick) Academy.requestEnhance(new Kick(serviceName));
    }

}
