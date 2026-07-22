package Scenario_Based;

class Me2 {

    public void ZomatoOrder(String dish ) {
        System.out.println("The order is placed " + dish);
    }

    public  void ZomatoOrder (int quantity){
        System.out.println("the plates you choose"+ quantity);
    }
}
class NEW4 {
    public static void main(String[] raj) {

        Me2 p1= new Me2();

        p1.ZomatoOrder(1);
        p1.ZomatoOrder("biryani");



    }
}