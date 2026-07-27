package VarArgs;
import java.util.Scanner;
public class EX2 {
     static void run(int... runs) {
         Scanner Scan = new Scanner(System.in);
         int input = Scan.nextInt();
         System.out.println("user input " + input);

         for (int num : runs) {


             System.out.println("this is printing the multiple inputs" + num);
         }
     }


        public static void main (String [] args){

        run(22,33,55);



}
}