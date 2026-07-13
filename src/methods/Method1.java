package methods;

public class Method1 {

    public static void Show(){
        System.out .println("Welcome..! to the calculation");

    }
    public static int  Cal(int a , int b){
        int result =  a + b ;
        return result ;
            }

            public static void main (String [] args ){

               Show();

               int answer = Cal(45 ,56);

               System.out.println(answer);


            }
}
