import Laptop.*;
import Refrigerator.*;
import SmartphoneCharger.*;
import java.util.Scanner;

public class UserApp {
    public static void main(String[] args) {
        Scanner appliance = new Scanner(System.in);
        Integer voltage;
        Integer ampere;
        Boolean toRun = true;

        while(toRun) {
            System.out.println("What device are you going to plug-in");
            System.out.println("[1]: Laptop");
            System.out.println("[2]: Refrigerator");
            System.out.println("[3]: Smartphone");
            System.out.print("Select a Device: ");
            int option = appliance.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Voltage: ");
                    voltage = appliance.nextInt();

                    System.out.print("Ampere: ");
                    ampere = appliance.nextInt();

                    Laptop_Adapter lpAdapter = new Laptop_Adapter(new Laptop(voltage, ampere));
                    System.out.println("\n"+lpAdapter.plugIn());
                    break;

                case 2:
                    System.out.print("Voltage: ");
                    voltage = appliance.nextInt();

                    System.out.print("Ampere: ");
                    ampere = appliance.nextInt();

                    Refrigerator_Adapter rfAdapter = new Refrigerator_Adapter(new Refrigerator(voltage, ampere));
                    System.out.println("\n" + rfAdapter.plugIn());
                    break;

                case 3:
                    System.out.print("Voltage: ");
                    voltage = appliance.nextInt();

                    System.out.print("Ampere: ");
                    ampere = appliance.nextInt();

                    SmartphoneCharger_Adapter spcAdapter = new SmartphoneCharger_Adapter(new SmartphoneCharger(voltage, ampere));
                    System.out.println("\n" + spcAdapter.plugIn());
                    break;
                default:
                    System.out.println("Invalid option");
                    toRun = false;
                    break;
            }
        }
    }
}