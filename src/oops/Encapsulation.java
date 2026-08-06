package oops;

import ClassObj.Employee;

public class Encapsulation {

    private String car ;
    private int speed ;

    void setdetails (String a , int b ){

        car = a;
        speed = b ;
    }
    void printdetails (){
        System.out.println("The car brand is  "  +car);
        System.out.println("The sepeed of car  is  "  +speed);
    }
 public static void main(String [] ags ) {

     Encapsulation run  = new Encapsulation() ;

    run.setdetails("TOYOTA SUPRAA..! ", 252);
     run.printdetails();

 }
}