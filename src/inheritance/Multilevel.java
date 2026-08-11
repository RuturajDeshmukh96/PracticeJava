package inheritance;

public class Multilevel {
    public void eat () {
        System.out.println("the base class ");

    }
}
class Dog1 extends Multilevel {
    public void dog () {
        System.out.println(" the dog is eating food ");
    }
}
class baby extends Dog1 {
    public void baby1(){
        System.out.println(" the baby dog is  sleeping ");
    }
    public static void main(String [] arg ){
     baby p1 = new  baby ();
     p1.baby1();
     p1.dog();
     p1.eat();
    }
}
