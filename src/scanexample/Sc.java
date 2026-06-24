package scanexample;

import java.util.Scanner;

public class Sc

{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("lets Add The numbers ");

        System.out.println("Enter the first number");
        int a = sc.nextInt();

        System.out.println("Enter second number");
        int b = sc. nextInt();

        int sum = a + b ;
        System.out.print( "The Addition of A and B is ");
        System.out.println(sum);
        sc.close();

    }
}
