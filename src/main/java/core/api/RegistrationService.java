package core.api;

import annotation.ServiceName;
import core.enhance.Academy;
import request.imopenloginsvc.RegisterAccountV1;

@ServiceName("registration_service")
public class RegistrationService {
    private final static String serviceName="registration_service";
    public RegisterAccountV1 registerAccountV1Prepare(){

        return (RegisterAccountV1) Academy.requestEnhance(new RegisterAccountV1(serviceName));
    }
}
