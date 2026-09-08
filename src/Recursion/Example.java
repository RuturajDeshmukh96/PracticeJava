package Recursion;

public class Example {

    public static void run (int n ) {
        if (n == 0 ) {
            System.out.println("go");
            return;
        }

        System.out.println(n);
        run(n-1 );
    }

    public static void main(String[] args) {
        System.out.println("Start CountDown");
        run(5);
    }
}
