package ExceptionHandling;

import java.sql.SQLOutput;

public class Check {

    public static void main (String [] ags ) {
        try {
            int a = 19 ;
            int b = 0 ;
            System.out.println(a/b);
            System.out.println(a);
            System.out.println(b);
        } catch (Exception e ){
            System.out.println("The code is not working of Divison : ");
        }
        finally {
            System.out.println("This is Fianal block its always Run : ");
        }
    }
}
