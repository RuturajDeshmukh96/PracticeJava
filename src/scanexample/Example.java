package scanexample;
import java.util.*;


public class Example {
    public  static void main (String []  args){

        Scanner sc = new Scanner (System.in );

        System.out.println("Addition");

       System.out.println("Enter the frist number");
       int a = sc.nextInt();

       System.out.println("Enter the second number ");
       int b = sc.nextInt();


        int sum = a+ b ;
        System.out.print("the total addition is ");
        System.out.println(sum);
        sc.close();
    }
}
