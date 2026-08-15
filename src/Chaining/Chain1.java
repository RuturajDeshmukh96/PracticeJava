package Chaining;

public class Chain1 {
    String name ;
    double marks ;
    public Chain1 () {
        this("Ruturaj", 89.99);
        System.out.println("thiss is default constructor ");
    }
    public Chain1 (String name , double marks ){
        this.name = name ;
        this.marks = marks ;
        System.out.println("this constrctor chaining =  " + "Name : "+ name + " \nMarks :  " + marks );
    }
    public static void main(String [] args ){
        Chain1 c = new Chain1 ();
    }
}
