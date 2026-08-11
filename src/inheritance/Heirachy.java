package inheritance;

public class Heirachy {
    public void Super(){
        System.out.println("this is the main base class Heirachy ");
    }
}
class Dog2 extends Heirachy{
    public void Dog () {
        System.out.println("this is printing the 1st child of the Heirachy ");
    }
}
class cat extends Heirachy {
    public void animal () {
        System.out.println("this is printing the 2nd child of the Heirachy ");
    }
    public static void main(String [] args ){
        cat p1 = new cat () ;
        p1.Super();
        Dog2 p2 = new Dog2() ;
        p2.Dog() ;
        p1.animal();
    }
}