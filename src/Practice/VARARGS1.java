package Practice;

public class VARARGS1 {
     static void Raw (int...price){
         System.out.println("this is printing the VARARGS!");

         int total = 0 ;

         for (int R : price ){
             total = total + R ;
     System.out.println(price.length + total );
         }
    }
    public static void main (String [] args ){

          VARARGS1.Raw(11,22,33);
          Raw(969,99,66);

          Raw(90,99);
    }
}
