package inheritance;

public class Multiple {
}
interface Drive {
    void move  () ;
}
interface Float{
    void move () ;
}
class Hower implements Drive , Float{

    @Override
    public void move() {
        System.out.println("the multiple inheritance in the java  ");
    }
    public static void main (String [] arg){
        Hower p1  = new Hower();
        p1.move();
    }
        }