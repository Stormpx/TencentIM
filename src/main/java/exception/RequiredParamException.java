package exception;

public class RequiredParamException extends RuntimeException {
    public RequiredParamException() {
        super();
    }

    public RequiredParamException(String message) {
        super(message+"不能为空");
    }

    public RequiredParamException(String message, Throwable cause) {
        super(message+"不能为空", cause);
    }

    public RequiredParamException(Throwable cause) {
        super(cause);
    }

    protected RequiredParamException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message+"不能为空", cause, enableSuppression, writableStackTrace);
    }
}
