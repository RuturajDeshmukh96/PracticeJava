package Practice;
import java.util.*;
public class Scene {
    public static void main (String [] args  ){

        System.out.println("Check your seat number Here ");
        Scanner scan = new Scanner(System.in);
          int Seatno = scan.nextInt();

          if ( Seatno % 2 == 0){
              System.out.println(" Your seat is at Right side --> Enjoy your film ");


        }else {System.out.println("your seat is at left side --> Enjoy your film  ");}

    }
}