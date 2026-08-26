package Chaining;

public class Chaain1 {
    String name ;
    int age ;
    float marks ;
    String pass ;
    public Chaain1 m1 (String name) {
        System.out.println("The frist methood - Name : " + name);
        return this ;
    }
    public Chaain1 m2 (int age ) {
        System.out.println("The second methood - age : " + age );
        return this ;
    }
    public Chaain1 m3  (float marks ){
        System.out.println("The third methood - marks : " + marks );
        return this ;
    }
    public  Chaain1 m4 (String pass) {
        System.out.println("The fourth methood - pass or fails : " + pass);
        return this ;
    }
    public static void main (String [] args ){
        Chaain1 c = new Chaain1 ();
        c.m1("Ruturaj").m2(22).m3(89.00f).m4("pass");
        System.out.println("The Method Chaining is running smoothly ");
    }
}


