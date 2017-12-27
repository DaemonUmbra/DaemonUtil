package daemonumbra.daemonutil.exceptions;

public class FingerprintViolationException extends Exception{

    public FingerprintViolationException() {
        super();
    }

    public FingerprintViolationException(String message) {
        super(message);
    }

    public FingerprintViolationException(String message, Throwable cause) {
        super(message, cause);
    }

    public FingerprintViolationException(Throwable cause) {
        super(cause);
    }

    protected FingerprintViolationException(String message, Throwable cause,
                        boolean enableSuppression,
                        boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
