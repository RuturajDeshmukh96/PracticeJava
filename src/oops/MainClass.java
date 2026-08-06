package oops;

public class MainClass {
    int a;
    int b;
    String yz;

    public MainClass(int a, int b, String yz) {
        this.a = a;
        this.b = b;
        this.yz = yz;
        System.out.println(a + " " + b + " " + yz);
        System.out.println("This is from the  Constructor ");
    }
}

interface Magic1 {
    public void manu();

    default void manu_1() {
        System.out.println("This is from the default method");
    }
}

class SubClass implements Magic1 {

    public static void main(String[] args) {
        MainClass obj = new MainClass(12, 13, "done");

        System.out.println("-------------------");

        SubClass sub = new SubClass();
        sub.manu();
        sub.manu_1();
    }

    @Override
    public void manu() {
        System.out.println("This is overridden manu method!");
    }

    @Override
    public void manu_1() {
        System.out.println("This is overridden manu_1 method!");
    }
}