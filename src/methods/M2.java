package methods;

public class M2 {

    public static void Rain ( ){

        System.out.println("this is the static method ");
    }
    public void Rock (int a , String b){
        System.out.println("this is printing the non static ");

    }
    public static void main (String [] args ){

        M2.Rain();

        M2 R  = new M2();
        R.Rock(11,"Ruturaj");
    }
}
