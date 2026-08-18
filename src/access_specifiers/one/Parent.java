package access_specifiers.one;

public class Parent {

    void m1(){

        System.out.println("this is a default method it can only be accessd within the same package classes");
    }

    protected void m2(){

        System.out.println("this is a protected method it nly can be accessed in the same pkg class");
        System.out.println("if we wan acccess in the diffeerent class we have to import and extend and ose the chiold class own object to call it");
    }

}
