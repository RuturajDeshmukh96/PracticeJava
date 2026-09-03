package DSA;
import java.util.*;

public class String_functions {
 public static void main (String [] args){
     String name = "Rohit ";
     String lname = "Sharma";
     String fname = name + lname ;
     System.out.println(name);
     System.out.println(lname );
     System.out.println(fname);
     System.out.println(name + " " + lname );

     for (int i = 0 ; i < fname.length() ;i ++){
         System.out.println(fname.charAt(i));
     }
 }
}
