package Constructor;
public class MainClass {
    int a ;
    int b ;
    String yz ;
    public MainClass(int a, int b , String yz){
        this.a =a ;
        this.b =b ;
        this.yz = yz ;
        System.out.println(a+" " + b+ " " +yz);
        System.out.println("This is from the Constructor ");
    }
}
interface Magic {
    void manu();
    default void  manu1 (){

        System.out.println("This is from the ");
    }

        }

class SubClass implements Magic {
    public static void main(String [] args ) {
        MainClass obj = new MainClass(12, 13, "done");
    }
        @Override
       public  void  manu1 (){

            System.out.println("This is from the ");
        }

    }


