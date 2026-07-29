package FACTORIAL;

public class RECOURSION {
    public static void main (String [] gnya ){

        System.out.println(factorial(6));
    }

    public static int factorial(int n ) {

        if (n == 1) {
            return 1;
        }
            return n * factorial(n-1 );

        }

}
