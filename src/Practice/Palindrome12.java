package Practice;
import java.util.Scanner ;
public class Palindrome12 {
    public static void main (String [] args ){
Scanner Sc = new Scanner (System.in);
System.out.println("enter the palindrome number");
        int number = Sc.nextInt();
        int reverse =  0 ;
int ori = number ;
        while (number > 0 ){

            int rem = number%10;

            reverse = reverse * 10 + rem ;
            number = number / 10 ;


            }
        if  (ori == reverse ) {
            System.out.println("thiss  is palindrome number ");
        }else{
            System.out.println("not a palindrome numberr");
        }

    }
}
