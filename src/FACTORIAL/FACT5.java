package FACTORIAL;
import java.util.Scanner ;
public class FACT5 {

    public static void main (String [] raje ){

        Scanner sc = new Scanner (System.in);
        System.out.println("enter the number which's factoial u want ");
        int number = sc.nextInt();
        int fact = 1;
        for (int i=1; i<=number ; i ++){
            fact = fact*i;

        }
        System.out.println("the factorial of given number is the : " + fact );
    }
}
