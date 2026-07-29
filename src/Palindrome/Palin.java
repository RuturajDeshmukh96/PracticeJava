package Palindrome;

public class Palin {

    public static void main(String[] arg) {


        int number = 121;
        int reverse = 0;
        int orignal = number;

        while (number > 0) {

            int rem = number % 10;
            reverse = reverse * 10 + rem;

            number = number / 10;


        }
        System.out.println("this is oringnal numbeer " + orignal);
        System.out.println("this is reverse number " + reverse);

        if (orignal == reverse) {

            System.out.println("this is the palindrome number  ");
        } else {
            System.out.println("'this is not palindrome nummber ");
        }


    }
}