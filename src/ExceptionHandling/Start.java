package ExceptionHandling;

public class Start {
    public static void main(String[] args) {
        try {
            int a = 10 ;
            int b = 0 ;
            System.out.println(a/b);

        } catch (Exception e) {
            System.out.println(" the err is in the  code ");

        }
    }
}
