package inheritance;

public class Base {
}
interface One1 {
    void one1  ();
}
interface  Two2 {
    void Two1 ();
}
class Final implements One1 , Two2{
    public void done () {
        System.out.println("this  is now implemented two interfaces ");
    }
    @Override
    public void one1 () {
        System.out.println("the overriding ");
    }

    @Override
    public void Two1 () {
        System.out.println("this is also overridding ");
    }
    public static void main(String [] args ){
        Final f1 = new Final();
        f1.done();
        f1.one1();
        f1.Two1();
    }
}