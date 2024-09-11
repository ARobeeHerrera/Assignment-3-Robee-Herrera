package Laptop;

public class Laptop {
    private Integer voltage;
    private Integer ampere;

    public Laptop(Integer voltage, Integer ampere) {
        this.voltage = voltage;
        this.ampere = ampere;
    }
    public String charge() {
        return "Laptop is Charging";
    }

    public String getPlugType() {
        return "Type-A";
    }

    public Integer getVoltage() {
        return voltage;
    }

    public Integer getAmpere() {
        return ampere;
    }
}
