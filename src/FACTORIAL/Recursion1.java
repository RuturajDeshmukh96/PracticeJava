package FACTORIAL;

public  class Recursion1 {
    public static void main (String [] RUTU){
        System.out.println(factorial(15));


    }
    public static  int factorial(int n ){

        if (n == 1 ) {
            return 1 ;
        }
        return n * factorial(n-1);
    }
}

