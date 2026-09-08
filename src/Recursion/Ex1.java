package Recursion;

import java.sql.SQLOutput;

public class Ex1 {
    public static  void Fast (int n) {
        if (n == 0 ) {
            System.out.println("Go..!");
            return;
        }
        System.out.println(n);

        Fast(n-1 );
    }
    public static void main (String [] args ) {
        System.out.println("  lets start countdown ");
        Fast(10);
    }
}
