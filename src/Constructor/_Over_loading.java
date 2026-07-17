package Constructor;

public class _Over_loading {


    public static int Rutu(int a , int b ){
        System.out.println("1st parameter ans ");
        return a * b ;
    }

    public static int Rutu(int a ,int b, int c){
        System.out.println("2nd paramter ans ");
        return a+b*c;

    }
    public static void main (String [] args ){
        System.out.println(Rutu(22,56));
        System.out.println(Rutu(11,100,50));
    }
}
