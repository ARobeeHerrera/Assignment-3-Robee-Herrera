package Laptop;

import Target.*;

public class Laptop_Adapter implements PowerOutlet {
    Laptop laptop;

    public Laptop_Adapter(Laptop laptop) {
         this.laptop = laptop;
    }

    @Override
    public String plugIn() {
        if(laptop.getVoltage() <= standardVoltage() && laptop.getAmpere() <= standardAmpere()) {
            return "Plug-type: " + laptop.getPlugType() +
                    "\nVoltage: " + laptop.getVoltage() +
                    "\nAmpere: " + laptop.getAmpere() +
                    "\n" + laptop.charge() + "\n";
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
