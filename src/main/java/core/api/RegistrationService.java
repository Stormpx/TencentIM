package core.api;

import annotation.ServiceName;
import core.enhance.Academy;
import request.imopenloginsvc.RegisterAccountV1Request;

@ServiceName("registration_service")
public class RegistrationService {
    private final static String serviceName="registration_service";
    public RegisterAccountV1Request registerAccountV1Prepare(){

        return (RegisterAccountV1Request) Academy.requestEnhance(new RegisterAccountV1Request(serviceName));
    }
}
