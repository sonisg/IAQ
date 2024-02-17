package LLDAdapterDP;

public class AdapterCharger implements AppleCharger{

    AndroidCharger androidCharger;

    public AdapterCharger(AndroidCharger androidCharger) {
        this.androidCharger = androidCharger;
    }

    @Override
    public void charge() {
        androidCharger.chargeAndroid();
    }
}
