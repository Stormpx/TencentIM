package core.api;

import annotation.ServiceName;
import core.enhance.Academy;
import request.imopenloginsvc.RegisterAccountV1Request;

@ServiceName("registration_service")
public class RegistrationService {

    public RegisterAccountV1Request registerAccountV1Prepare(){

        return new RegisterAccountV1Request();
    }
}
