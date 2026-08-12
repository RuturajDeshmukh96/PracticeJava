package inheritance;

public class Multiple {
}
interface Drive {
    void move  () ;
    default void move1 () {
        System.out.println("this is from the interface ");
    }
}
interface Float{
    void move () ;
}
class Hower implements Drive , Float{

    @Override
    public void move() {
        System.out.println("the multiple Inheritance in the java  ");
    }
    public static void main (String [] arg){
        Hower p1  = new Hower();
        p1.move();
        p1.move1();
    }
        }