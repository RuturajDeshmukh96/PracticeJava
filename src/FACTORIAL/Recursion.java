package FACTORIAL;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(factorial(10));
    }
        public static int factorial ( int n ){

        if (n == 1 ){
            return 1 ;// this stops the recursion
        }

            return  n* factorial (n- 1); // this calls methods itself for calculations

        }
    }
