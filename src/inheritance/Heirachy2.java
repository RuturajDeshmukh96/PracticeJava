package inheritance;

public class Heirachy2 {
    public void base () {
        System.out.println("this is the base class ");
    }
}
class Truth extends Heirachy2{
    public void truth (){
        System.out.println("this is frist child ");
    }
}
class False extends Heirachy2 {
    public void wrong() {
        System.out.println("this is second child ");
    }
    public static void main(String [] args ){
        Truth t1 = new Truth();
        t1.base();
        t1.truth();
        False f1 = new False();
        f1.wrong();
    }
}