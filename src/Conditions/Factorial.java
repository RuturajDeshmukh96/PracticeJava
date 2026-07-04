package Conditions;

public class Factorial {
    public static void main(String [] args ){

        int i = 1;
        int n = 10;
          int factorial = 1 ;
        while  (i<=n ){
            factorial *= i ;
            i++;
            System.out.println("Factorial of "  + n +  "is :" +  factorial);

        }
    }
}
