package ExceptionHandling;

public class More {
    public static void main(String [] args ){
        try{
            int  a = 10 ;
            int  b =0 ;
            System.out.println(a/b);
        }catch (Exception e ){
            System.out.println("The err is held in this code ");
        }
        finally {
            System.out.println("The finalllly block it doesn't care about err it always  run ");
        }
    }
}
