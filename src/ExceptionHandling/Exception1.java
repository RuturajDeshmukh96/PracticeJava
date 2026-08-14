package ExceptionHandling;

public class Exception1 {
    public static void main(String [] args ){
        try{
            int a = 10 ;
            int b = 0 ;
            System.out.println("The Answer is :" + a+b);
            System.out.println("The Answer is :" + a/b);

        }catch (Exception e ){
            System.out.println("SomeThing is wrong in this code ");
        }
        finally {
            System.out.println("I am finnaly block, I dont care about the error I always run ");
        }
    }
}
