package Refrigerator;

import Target.*;

public class Refrigerator_Adapter implements PowerOutlet {
    Refrigerator refrigerator;

    public Refrigerator_Adapter(Refrigerator refrigerator) {
        this.refrigerator = refrigerator;
    }

    @Override
    public String plugIn() {
        if(refrigerator.getVoltage() <= standardVoltage() && refrigerator.getAmpere() <= standardAmpere()) {
            return "Plug-type: " + refrigerator.getPlugType() +
                    "\nVoltage: " + refrigerator.getVoltage() +
                    "\nAmpere: " + refrigerator.getAmpere() +
                    "\n" + refrigerator.startCooling() + "\n";
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
