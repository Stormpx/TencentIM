package core.api;
import annotation.ServiceName;
import core.enhance.Academy;
import request.imopenloginsvc.AccountImportRequest;
import request.imopenloginsvc.KickRequest;
import request.imopenloginsvc.MultiAccountImportRequest;

@ServiceName("im_open_login_svc")
public  class ImOpenLoginSvc {
    public AccountImportRequest accountImportPrepare(){
        return new AccountImportRequest();
    }
    public MultiAccountImportRequest multiaccountImportPrepare(){
        return new MultiAccountImportRequest();
    }
    public KickRequest kickPrepare(){
        return new KickRequest();
    }

}
