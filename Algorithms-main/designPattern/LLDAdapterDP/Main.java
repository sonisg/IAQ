package LLDAdapterDP;

public class Main {

    public static void  main(String args[]){

       // AppleCharger appleCharger = new ChargerXYZ();

        AppleCharger appleCharger = new AdapterCharger(new DKCharger());

        ApplePhone applePhone = new ApplePhone(appleCharger);
        applePhone.charge();

    }
}
