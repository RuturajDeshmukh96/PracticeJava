package ExceptionHandling;

public class Handle {
    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;
            System.out.println(a / b);
        }catch (Exception e ){
            System.out.println("something is wrong in this code");
            System.out.println(e);
        }
        finally {
            System.out.println("This is the finally block and always run : ");
        }
    }
}