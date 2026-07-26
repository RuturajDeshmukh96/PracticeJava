package FACTORIAL;
import java.util.Scanner;
public class Fact3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter the number which you want to check for FACTORIAL :");

        int number = scan.nextInt();

        int fact = 1;

        for (int i = 1; i <= number; i++) {
            fact = fact * i;

        }
        System.out.println(number + "the factorial is " + fact);
    }
}
