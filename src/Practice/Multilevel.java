package Practice;

public class Multilevel {
    public void Base() {
        System.out.println("the base class");
    }
}
class One extends Multilevel {
    public void one1 () {
        System.out.println("this is the 1 st child ");
    }
}
class Two extends One {
    public void two1 () {
    System.out.println("this is 2nd child ");
}
public static void main(String [ ] args ){
        Two p1 = new Two();
        p1.Base();
        p1.one1();
        p1.two1();
}
}