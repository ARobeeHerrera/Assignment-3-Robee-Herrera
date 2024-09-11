package Refrigerator;

public class Refrigerator {
    private Integer voltage;
    private Integer ampere;

    public Refrigerator(Integer voltage, Integer ampere) {
        this.voltage = voltage;
        this.ampere = ampere;
    }
    public String startCooling() {
        return "Refrigerator starts cooling";
    }

    public String getPlugType() {
        return "Type-B";
    }

    public Integer getVoltage() {
        return voltage;
    }

    public Integer getAmpere() {
        return ampere;
    }
}
