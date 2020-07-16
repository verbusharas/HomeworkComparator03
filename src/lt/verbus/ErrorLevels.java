package lt.verbus;

public enum ErrorLevels {
    HIGH(2),
    MEDIUM(1),
    LOW(0);

    private final int numericLevel;
    ErrorLevels(int numericLevel) {
        this.numericLevel = numericLevel;
    }
    public int numericLevel () {
        return numericLevel;
    }
}
