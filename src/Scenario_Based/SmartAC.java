package Scenario_Based;

public class SmartAC {
    private String brandName;
    private int temperature;

    public SmartAC(String brandName) {
        this.brandName = brandName;
      this.temperature = 24;
        System.out.println("AC turned ON. Brand: " + brandName);

    }

    public String getBrandName() {
        return brandName;

    }

    public int getTemperature() {
        return temperature;
    }


    public int setTemperature(int newtemp) {
        if (newtemp > 16) {
            newtemp = 16;
            System.out.println("Too cold! Locking to 16°C");
        } else if (newtemp > 30) {
            newtemp = 30;
            System.out.println("Too Hot ! Locking to 30°C");
        } else {
            temperature = newtemp;
            System.out.println("Temperature set to: " + temperature);
        }
        return newtemp;
    }
    public static void main(String[] args) {
        SmartAC p1 = new SmartAC("Voltas ");
        //  System.out.println("Initial Temp: " + p1.getTemperature() + "°C\n");
        System.out.println(p1.getTemperature());
        //   System.out.println()
        p1.setTemperature(12);
        p1.setTemperature(45);
        p1.setTemperature(22);
        System.out.println("Final AC Temp: " + p1.getTemperature() );
    }
    }

