package Conditions;
import java.util.Scanner;
public class Even_Odd {

    public static void main (String [] args ){
    Scanner Scan = new Scanner (System.in);
    System.out.println("Enter the number ");

    int num  = Scan.nextInt();


     if (num % 2 == 0){
    System.out.println("the number is even");
    }else {
        System.out.println(" the number is odd ");

}}}