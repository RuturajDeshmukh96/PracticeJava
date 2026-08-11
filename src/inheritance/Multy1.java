package inheritance;

public class Multy1 {

}
interface  One3 {
    void one  ();

    default void one1 (){
    System.out.println("thiis is the parent interaface no-1");
}
}
interface Two3 {
    void one ();
    default void two1 (){
        System.out.println("thiis is the parent interaface no-2");
    }
}
class Boom implements One3 , Two3 {
    @Override
    public void one (){
        System.out.println("this is the  overridng the  parent 1 & 2 ");
    }
    public static void main(String [] args ){
        Boom b =  new  Boom ();

        b.one1();
        b.two1();
        b.one();
    }
}