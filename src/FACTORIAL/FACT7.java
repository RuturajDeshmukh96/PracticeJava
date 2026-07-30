package FACTORIAL;
import java.util.Scanner ;
public class FACT7 {
    public static void main (String []args ){
        System.out.println("Enter your number here");
        Scanner Rut = new Scanner (System.in);
        int num = Rut.nextInt();
        int fact = 1;

        for (int i = 1 ; i <= num ;i++){

            fact = fact * i ;

            System.out .println(fact);
        }// done


    }
}
