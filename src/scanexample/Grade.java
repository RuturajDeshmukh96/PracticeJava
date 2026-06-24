
package scanexample;
import java.util.*;

public class Grade {

    public static void main (String [] args ){

        Scanner scan = new Scanner (System.in);

        System.out.println("Enter maths marks :");
        int math = scan.nextInt ();

        System.out.println("Enterr Sci Marks : ");
        int sci = scan.nextInt ();

        System.out.println("Enter phys Marks : ");
        int phys = scan.nextInt () ;

        System.out.println("Enter eng marks : ");
        int eng = scan.nextInt ();

        System.out.println("Enter data science  marks : ");
        int ds = scan.nextInt ();

        System.out.println("Enter java Marks : ");
        int java = scan.nextInt() ;

        Float percentage = ((math+ sci + phys + eng + ds+ java )/600.0f)*100;

        System.out.println ("Grand Percentage is : ");
        System.out.println(percentage);


    }
}


