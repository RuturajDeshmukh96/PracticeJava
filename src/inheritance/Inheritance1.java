package inheritance;

public class Inheritance1 {
    public void Animal () {
        System.out.println(" the dog is a animal ");
    }
}
class Dog extends Inheritance1 {
//    public void Animal (){
//        System.out.println("the dog is barking ");
//    }
    public void Bark (){
        System.out.println("the dog is barking noow ");
    }
    public static void main(String [] args ){
        Dog p1 = new Dog ();
        p1.Animal();
         p1.Bark();

        }
    }
