package FACTORIAL;

public class Fact {
    public static void main (String [ ]  args ){

        System.out.println("this is printing  the factorial number");

        int  number =5 ;
        int fact = 1;

        for (int i = 1 ; i< number ; i++){

            fact = fact * i ;
            System.out.println(number + "factorial is " + fact);
        }
    }
}
