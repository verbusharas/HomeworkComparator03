package lt.verbus;

public class HttpCode {
    ErrorLevels errorLevel;
    public HttpCode(ErrorLevels errorLevel) {
        this.errorLevel = errorLevel;
    }

    public ErrorLevels getErrorLevel() {
        return errorLevel;
    }

    @Override
    public String toString() {
        return "Error level: " + errorLevel;
    }
}
