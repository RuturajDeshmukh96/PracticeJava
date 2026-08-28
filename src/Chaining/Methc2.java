package Chaining;

public class Methc2 {
    public  Methc2 m1 (String name ) {
        System.out.println("this is first method   "+ name );
        return this;
    }
    public Methc2 m2 (int age ){
        System.out.println("the age is   " + age );
        return this;
    }

    static void main() {
        Methc2 m =  new Methc2();
        m.m1("Rutu").m2(23);
        //System.out.println(m1+m2);
    }
}
