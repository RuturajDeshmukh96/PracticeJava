package oops;


public class POLY_OL {
    String name;
    int age;
    float marks;
     String Collagename ;

    public void Print(String name) {
        System.out.println(name);
    }

    public void Print(int age) {
        System.out.println(age);

    }

    public void Print(Float marks) {
        System.out.println(marks);
    }
    public void Danger (String Collagename ){
        System.out.println(Collagename);
    }
}
 class Do extends POLY_OL {
     @Override
     public void  Danger (String Collagename ){
         System.out.println("MIT");
         // return this ;
     }
    public static void main(String[]args ) {

        POLY_OL p1 = new Do();
      //  POLY_OL p1 = new ();
        p1 . age = 21 ;
        p1 . name ="Ruturaj";
        p1. marks = 89.0f;
        p1.Collagename = "Sveri";
        p1.Print(p1.name );
        p1.Print(p1.marks);
        p1.Print(p1.age);
        p1.Danger(p1.Collagename);
      //  p1.Danger(p1.Collagename);

    }

}
// Polymorphism
// overloading
// same method name with diff diff parameter ;
// it is compile  time