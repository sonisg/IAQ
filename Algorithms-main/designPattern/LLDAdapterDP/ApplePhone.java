package LLDAdapterDP;

public class ApplePhone {

    AppleCharger appleCharger;

    public ApplePhone(AppleCharger appleCharger) {
        this.appleCharger = appleCharger;
    }

    void charge(){
        appleCharger.charge();
        System.out.println("Charge iphone");
    }
}
