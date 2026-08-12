package Practice;

public class Heirachy {
    public void base () {
        System.out.println(" this is the base class ");
    }
}
class One2 extends Heirachy{
    public void one () {
        System.out .println("this is the frist child of Heirachy");
    }
}
class Two2 extends Heirachy{
    public void two ( ) {
        System.out.println("the 2nd child if Heirachy ");
    }
    public static void main (String [] args ){
        One2 p1 = new One2 () ;
        Two2 p2 = new Two2() ;
        p1.base();
        p1.one();
        p2.two();
    }
}