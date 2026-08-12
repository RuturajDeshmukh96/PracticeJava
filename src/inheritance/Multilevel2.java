package inheritance;

public class Multilevel2 {
    public void base1() {
        System.out.println(" this is the base class of this file");
    }
}
class One4 extends Multilevel2 {
    public void one3 () {
        System.out.println("this is the frist class ");
    }
}
class Two4 extends  One4 {
    public void two4 (){
        System.out.println("this is second class ");
    }
    public static void main (String [] args ){
        Two4 p1 = new Two4() ;
        p1.base1();
        p1.one3();
        p1.two4();
    }
}