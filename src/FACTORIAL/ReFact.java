package FACTORIAL;
import java.util.Scanner ;
public class ReFact {
    public static void main(String []   args ) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("enter the number which u want to check factorial :");

        int n = Scan.nextInt();
  System.out.println(factorial(n));
    }
    public static int factorial( int n ){

        if (n == 1 ) {
            return 1;
        }
            return n* factorial(n-1);
        }
    }


