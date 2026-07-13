package Conditions;
import java .util.*;

public class Test {
    public static void main(String[] args) {

        int m1, m2, m3;

        Scanner scan = new Scanner(System.in);

        System.out.println(" Enter the marks of 3 subject  ");

        System.out.println("Enter science marks");

        m1 = scan.nextInt();

        System.out.println("Enter maths marks");

        m2 = scan.nextInt();

        System.out.println("Enter the english marks ");

        m3 = scan.nextInt();

        float percentage = ((m1 + m2 + m3) / 300.0f) * 100;
        System.out.println("your total percenatge is " + percentage);

        if (percentage >= 40 && m1 >= 33 && m2 >= 33 && m3 >= 33) {
            System.out.println("Congratulations..! you are passed successfully");

        } else {
            System.out.println(" Try again you are failed...!!!");
        }

    }

}



