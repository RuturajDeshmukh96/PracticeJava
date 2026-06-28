package Conditions;
import java .util.*;
public class Raw {

 public static void main (String [] args ) {

     Scanner run = new Scanner (System.in);
     System.out.println("Enter your age here ");
    // int age ;
     int age = run.nextInt();

     if (age >= 50 ){
         System.out.println("You are experinced");
     } else if (age >= 40 ){
         System.out.println("You are semi - experinced ");
     } else if ( age >= 30  ){
         System .out.println("You are well matured");
     } else if (age >=  20  ){
         System.out.println(" You are young A hot Blodded");
     } else
         System.out.println ("You are baby ");
     }


 }

