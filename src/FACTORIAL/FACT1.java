package FACTORIAL;
import java.util.Scanner;
public class FACT1 {

    public static void main(String [] raje ){

        Scanner Scan = new Scanner (System.in);
        System.out.println("Enter the number here which factorial you want :  ");
        int number  = Scan.nextInt();
        int fact = 1 ;

        for (int i = 1 ; i <= number ; i++){
            fact = fact * i ;
        }
        System.out .println(number +""+"'  s factorial is the "+ fact);

    }
}
