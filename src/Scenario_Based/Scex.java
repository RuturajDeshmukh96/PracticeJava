package Scenario_Based;
import java.util.*;
public class Scex {

    public static void main(String[] args) {

        System.out.println("Enter your bill Amount ");

        Scanner scan = new Scanner(System.in);

        int BillAmount = scan.nextInt();

        if (BillAmount >= 2000) {
            System.out.println("Congratulations..! You get 10% discount on your bill");
        } else {
            System.out.println("Thank you for shopping... Visit again");

        }
    }
}
