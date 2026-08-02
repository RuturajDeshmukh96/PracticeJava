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
class SubClass{
    public static void main(String [] args ){
        MainClass obj = new MainClass(12,13,"done");

    }

}
