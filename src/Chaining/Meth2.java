package Chaining;

public class Meth2 {
    String name ;
    int age ;
    float marks ;
    boolean pass ;
    public  Meth2 m1 (String name ) {
        System.out.println("Frist method of class - name : "+name ) ;
        return this ;
    }
    public Meth2 m2 (int age ){
        System.out.println("Second method of class - age : "+ age );
        return this ;
    }
    public Meth2 m3 (float marks ){
        System.out.println("Third method of class - marks : " + marks  );
        return this ;
    }
    public Meth2 m4 (boolean pass) {
        System.out.println("Fourth method of the class - pass or fail : "+ pass);
        if (pass){
            System.out.println("Pass");
        }  else {
                System.out.println("fail");
        }

        return this ;
    }
    public static void main (String [] args ){
        Meth2 m = new Meth2 ();
        m.m1("Ruturaj").m2(22).m3(89.00f).m4(true );
    }
}
