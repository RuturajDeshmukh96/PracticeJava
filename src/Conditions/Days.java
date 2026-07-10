package Conditions;
import java.util.*;
public class Days {
    public static void main(String [] args) {

        System.out.println("Enter the days : ");

        Scanner scan = new Scanner(System.in);

        int day = scan.nextInt();
        switch (day) {

            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednsday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Friday");
            case 7 -> System.out.println("Saturday");

            default -> System.out.println("Enter only week days :");
        }

    }
}
