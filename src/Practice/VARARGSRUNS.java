package Practice;
import java.util.*;
public class VARARGSRUNS {
   static void CountRuns (int...runs){
       System.out.println(" this is priting counting the  runs ");

       int total  = 0 ;
       for (int Count : runs ){
           total = total + Count ;
           System.out.println( total );

       }
   }
  public static void main (String [] raje ) {

       System.out.println("this is printing the runs counnting" );
  Scanner scan = new Scanner (System.in);
  System.out.println("enter the frist over runs ");
     int runs = scan.nextInt();
       CountRuns (1,2,3,6,0,3);
       CountRuns(6,5,4,3,2,1);
       CountRuns(4,3,2,1,2,4);
       CountRuns(0);
  }// this is now showing the user input also
}

