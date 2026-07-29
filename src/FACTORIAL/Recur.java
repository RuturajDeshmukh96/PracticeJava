package FACTORIAL;
import java.util.Scanner ;
public class Recur {
    public static void main (String [] args ){

        Scanner S = new Scanner (System.in);

        System.out.println("enter your age ");
        int age = S.nextInt();

        System .out.println("enter your name ");
        String name = S.next();

        System.out.println("enter your city ");
        String city = S.next();

        System.out.println("your name is :" + name );
        System.out.println("your age is :" + age );
        System.out.println("your city is " + city );
    }
}
