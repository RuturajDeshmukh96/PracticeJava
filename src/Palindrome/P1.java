package Palindrome;
import java.util.Scanner ;
public class P1 {
    public static void main (String [] raj ){
    Scanner scan = new Scanner (System.in);
    System.out.println(" Enter the number to  Check the number is  palindorme or not ");
    int number = scan.nextInt();
    int original = number ;
    int reverse = 0;

    while (number > 0 ){
        int rem = number % 10 ;
        reverse = reverse * 10 + rem ;

        number = number / 10 ;
    }
    System.out.println("printing original number" + original);
    System.out.println("printing reverse number "+reverse);


    if (reverse == original ) {
        System.out.println("this is the palindrome number ");
    }else{
        System.out.println("this is  not a palindrome number");
    }
    }
}
