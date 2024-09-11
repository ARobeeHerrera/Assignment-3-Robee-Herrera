package SmartphoneCharger;

public class SmartphoneCharger {
    private Integer voltage;
    private Integer ampere;

    public SmartphoneCharger(Integer voltage, Integer ampere) {
        this.voltage = voltage;
        this.ampere = ampere;
    }

    public String chargePhone() {
        return "Smartphone is charging";
    }

    public String getPlugType() {
        return "Type-C";
    }

    public Integer getVoltage() {
        return voltage;
    }

    public Integer getAmpere() {
        return ampere;
    }
}

