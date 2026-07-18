package Poly;

public class Method_Overloading {


    public static int add(int a , int b ){
        System.out.println("This is printing the method one with 2 paramter ");
        return a+ b;
    }

    public static int add(int a , int b , int c){
        System.out.println("This is printing the method 2 with 3 paramter ");
        return a+b+c ;

    }
    public static void main (String [] dj){
        System.out.println(add(11,22));
        System.out.println(add(22,33,43));



    }
}
