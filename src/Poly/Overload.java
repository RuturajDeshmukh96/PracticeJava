package Poly;

public class Overload {

public static int add (int a, int b ){
    System.out.println("calling the addding method with 2 parameter  ");
    return a + b;
}

public static int add (int a , int  b ,int c ){
    System.out.println("calling the methid with 3 parameter ");
    return a + b + c ;

}
public static void main (String [] gnya ){
  System.out.println(add(12,21));
    System.out.println(  add(12,23,34));

}
}


