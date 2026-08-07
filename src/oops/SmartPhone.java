package oops;

public class SmartPhone {
    private String phoneModel;
    private int batteryLevel;

    public SmartPhone(String phoneModel) {
        this.batteryLevel = 100;
        this.phoneModel = phoneModel;
        System.out.println("New Phone Bought: " + phoneModel);

    }

    public String getPhoneModel() {
        return phoneModel;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void drainBattery(int usedPercent) {
        batteryLevel = batteryLevel - usedPercent;
        if (batteryLevel < 0) {
            batteryLevel = 0;
            System.out.println("Battery drained. Remaining: " + batteryLevel + "%");
        }else {
            System.out.println("battery is remaining " + batteryLevel);
        }
    }

    public void chargePhone(int chargePercent) {
        batteryLevel = batteryLevel + chargePercent;
        if (batteryLevel > 100) {
            batteryLevel = 100;
            System.out.println("Battery is FULL! 💯");
        } else {
            System.out.println( " Phone charged. Current: " + batteryLevel + "%");
        }
    }

    public static void main (String [] args ){
        SmartPhone x = new SmartPhone(" OnePlus x ");
        x.drainBattery(40);
        x.drainBattery(90);
        x.chargePhone(150 );
       System.out.println( "The final battry level "+ x.getBatteryLevel());

    }
}