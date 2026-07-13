package methods;

public class Meth {



    public static void Showmessage (){
        System.out.println("Welcome in the calculator ");

    }
    public static int Multiply( int num1 ,int num2){
        int answer = num1 * num2 ;
 return answer;
    }


    public static void  main (String [] args ){

        Showmessage();

       int myresult= Multiply (8,2);
       System.out.println("The Multiplication of given values are " + myresult);

    }
}