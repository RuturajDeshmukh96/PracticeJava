package scanexample;
import java.util.*;
public class pass {
    public static void main(String[] args) {

        int m1, m2, m3;

        Scanner scan = new Scanner(System.in);

        System.out.println("enter your eng marks ");
        m1 = scan.nextInt();

        System.out.println("enter your math  marks");

        m2 = scan.nextInt();

        System.out.println("enter your sci marks");
        m3 = scan.nextInt();
        float avg = ((m1 + m2 + m3) / 300) * 100;
        System.out.println(avg);

        if (avg >= 40 && m1 >= 33 && m2 >= 33 && m3 >= 33) {


                System.out.println("congratultions you are passed the exam  ");

            } else{


            System.out.println("failed");
        }

    }
}





