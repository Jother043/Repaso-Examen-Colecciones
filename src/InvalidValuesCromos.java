public class InvalidValuesCromos extends Exception{
    public InvalidValuesCromos() {
    }

    public InvalidValuesCromos(String message) {
        super(message);
    }

    public InvalidValuesCromos(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidValuesCromos(Throwable cause) {
        super(cause);
    }

    public InvalidValuesCromos(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
