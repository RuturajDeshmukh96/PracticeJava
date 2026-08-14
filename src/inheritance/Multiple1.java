package inheritance;

public class Multiple1 {
    public void run() {
        System.out.println("This is the example of the Heirachical Inheritance ");
    }
}
interface Run {
    void coin () ;
 default void coin1 () {
     System.out.println("This is the frist Interface (Parent_1)");
 }
    }
interface Run1 {
    void coin2 () ;
    default void coin3 () {
        System.out.println("This is the second Interface (Parent_2)");
    }
}
class Done extends Multiple1 implements Run ,Run1 {
    public void coin4 (){
        System.out.println("This is the Child class");
    }
    public static void main(String [] args ){
       // Multiple1 m1 = new Multiple1();

        Done d1 = new Done  ();
        d1.run();
        d1.coin1();
        d1.coin3();
        d1.coin4();
        System.out.println("Now Printing the Overridding Methods ");
        d1.coin();
        d1.coin2();
    }
    @Override
    public void coin () {
        System.out.println("Overridding the coin method");

        run();
    }
    @Override
    public void coin2 () {
        System.out.println("Overridding the coin2 method   ");
    }
}
