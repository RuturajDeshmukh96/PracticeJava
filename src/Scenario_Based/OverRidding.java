package Scenario_Based;

class OverRidding {

    public void drive() {
        System.out.println("old car running with 50kmh speed");
    }
}
    class Son extends OverRidding {

        @Override

        public void drive() {
            System.out.println("the new car is running  with 300 kmh speed");
        }
    }
class Ridding {

    public static void main (String [] raj){

        Son obj = new Son();

        obj.drive();
    }
}
