package Target;

public interface PowerOutlet {
    public String plugIn();

    default Integer standardVoltage() {
        return 240;
    }

    default Integer standardAmpere() {
        return 16;
    }
}
