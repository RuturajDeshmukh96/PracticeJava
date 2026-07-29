package Practice;
import java.util.Scanner;
public class Palindrome {
    public static void main (String [] Raj ){
       Scanner SC = new Scanner (System.in) ;
       System.out.println("enter the number to check the number is palindrome or not ");
       int number = SC.nextInt();
       int ori = number ;
       int reverse = 0 ;
       while (number > 0 ){
           int rem = number % 10 ;
           reverse = reverse * 10 + rem ;
           number = number / 10;

       }
       System.out.println("original number :" + number);
       System.out.println("Reversed number :" + reverse);

       if (ori  == reverse ) {
           System.out.println(ori + " : is a palindrome number");
       }else{
           System.out.println(ori +" : is not a palindrome number");
       }
    }
}
