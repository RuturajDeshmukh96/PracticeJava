package Conditions;
import java .util.Scanner;
public class _Switch {
    public static void main(String[] args) {
        System.out.println("Enter your age");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();

        switch(age){

        case 18:
        System.out.println("you are adult now");
        break;

        case 25:
        System.out.println("you are mature ");
        break;
        case 55:
        System.out.println("you are senior now ");
        break;

            default:
                System.out.println(" just enjoy the journy don't think  about your age");


    }
    }
}