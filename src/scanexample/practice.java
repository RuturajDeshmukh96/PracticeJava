package scanexample;
import java.util.*;
public class practice {
    public static void main (String [] args ){

        Scanner scan = new Scanner (System.in);

        System.out.println("Enter maths  marks ");
        int math = scan .nextInt();

        System.out.println("Enter sci marks");
        int sci = scan . nextInt ();

        System.out.println("Enter eng marks");
        int eng = scan . nextInt ();

        System.out.println ("Enter the java marks " );
        int java = scan . nextInt();

        Float percentage =( (math + sci + eng + java)/400.0f)*100;

        System.out.println("total percentage is thee :");

        System.out.println(percentage);

    }
}
