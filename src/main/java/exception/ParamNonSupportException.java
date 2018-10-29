package exception;

public class ParamNonSupportException extends RuntimeException {
    public ParamNonSupportException() {
        super();
    }

    public ParamNonSupportException(String message) {

        super(message);
    }

    public ParamNonSupportException(String message, Throwable cause) {

        super(message, cause);
    }

    public ParamNonSupportException(Throwable cause) {
        super(cause);
    }

    protected ParamNonSupportException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
