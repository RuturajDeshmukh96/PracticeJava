package Practice;

public class Me1 {


    public static void Run() {
        System.out.println("this is priniting the static method ");


    }
    public void Walk () {
        System.out.println("this is printing the non static method");
    }
    public static void main (String [] bhag){

        Me1.Run();
        Me1 p1 = new Me1();
        p1.Walk();
    }
}