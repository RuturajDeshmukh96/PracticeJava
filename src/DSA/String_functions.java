package DSA;
import java.util.*;

public class String_functions {
  static   String name = "tony";
    static String Lname = "Stark";
    static String Fname = name + Lname ;
    public  static void main(String [] args) {
        System.out.println(name);
        System.out.println(Lname);
        System.out.println(Fname);
        System.out.println(Lname + " " + name);
        System.out.println(Fname.length());
        for (int i = 0 ; i < Fname.length() ; i++ ){
            System.out.println(Fname.charAt(i));
        }
    }
}
