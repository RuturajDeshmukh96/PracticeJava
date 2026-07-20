package Scenario_Based;
import java.util.Scanner ;
 class Zomato {

    public void order(String thali,int plates ) {
        System.out.println("your"+ " " + thali + " "+"is ready to go please wait for 5 min  "+ " you ordered  " + plates +" "+ "plate");
    }
    public void order(String colddrink){
        System.out.println(" And also you ordered "+ " " + colddrink +" " +  "colddrink");
    }

}
 class Delivary  {

    public static void main (String [] Tomato){

        Zomato order= new Zomato ();

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to zomato order please..!@ ");
        String food =scan.next();

        System.out.println("how many plates do you want ");
        int count = scan.nextInt();



        System.out.println("any coldrink you need");
        String cold = scan.next();

        order.order(food,count);

        order.order(cold);
    }
}