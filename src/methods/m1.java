package methods;

public class m1 {

    public static void main (){
        System.out.println("using thhe static method");
    }

    public void Run(){
        System.out.println("using the non-static method");
    }

    public  static void main(String [] raje ){

        m1.main();
        m1 ram  = new m1();

        ram.Run();
    }
}
