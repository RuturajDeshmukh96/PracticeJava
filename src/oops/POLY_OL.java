package oops;

public class POLY_OL {
    String name;
    int age;
    float marks;

    public void Print(String name) {
        System.out.println(name);
    }

    public void Print(int age) {
        System.out.println(age);

    }

    public void Print(Float marks) {
        System.out.println(marks);
    }
}
 class Do {
    public static void main(String[]args ) {
        POLY_OL p1 = new POLY_OL();
        p1 . age = 21 ;
        p1 . name ="Ruturaj";
        p1. marks = 89.0f;
        p1.Print(p1.name );
        p1.Print(p1.marks);
        p1.Print(p1.age);

    }
}
// Polymorphism
// overloading
// same method name with diff diff parameter ;
// it is compile  time