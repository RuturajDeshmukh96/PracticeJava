package ExceptionHandling;

public class India {
    public void run () {
        System.out.println("This is the main Class");
        System.out.println("i am from India ");
    }
}
class Maharashtra extends India {
    public void run1 (){
        System.out.println("i am from Maharashtra ");
    }
}
class Pune extends Maharashtra {
    public void run2 () {
        System.out.println("i am living in the pune city ");
    }
    public static void main (String [] arg ){
        Pune p1 = new Pune();
        p1.run();
        p1.run1();
        p1.run2();
    }
}
