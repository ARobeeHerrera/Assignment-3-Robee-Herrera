package SmartphoneCharger;

import Target.*;

public class SmartphoneCharger_Adapter implements PowerOutlet {
    SmartphoneCharger smartphoneCharger;

    public SmartphoneCharger_Adapter(SmartphoneCharger smartphoneCharger) {
        this.smartphoneCharger = smartphoneCharger;
    }


    @Override
    public String plugIn() {
        if(smartphoneCharger.getVoltage() <= standardVoltage() && smartphoneCharger.getAmpere() <= standardAmpere()) {
            return "Plug-type: " + smartphoneCharger.getPlugType() +
                    "\nVoltage: " + smartphoneCharger.getVoltage() +
                    "\nAmpere: " + smartphoneCharger.getAmpere() +
                    "\n" + smartphoneCharger.chargePhone() + "\n";
        }else  {
            return "Too much power, the power outlet will overload\n";
        }
    }

    @Override
    public Integer standardAmpere() {
        return PowerOutlet.super.standardAmpere();
    }

    @Override
    public Integer standardVoltage() {
        return PowerOutlet.super.standardVoltage();
    }
}
