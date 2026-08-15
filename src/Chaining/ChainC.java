package Chaining;

public class ChainC {
    int salary ;
    String name ;
    public ChainC () {

        this("Don " , 0 );
        System.out.println("the frist (Deault ) constructor ");

    }


    public ChainC (String name, int salary ) {
        this.name = name ;
        this.salary = salary ;
        System.out.println("the frist constructor " + name + salary );
    }
    public static void main(String [] args ){
        ChainC c = new ChainC() ;

    }
}
