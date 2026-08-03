package oops;

public class Vehicle {
    int speed;
    String name ;
    public Vehicle(String name , int speed ){
        this.speed=speed;
        this.name = name ;
        System.out.println("The  car name  is " + name + "  " + " current speed is " + speed);

    }
    public void Run (){
        System.out.println(" lets drive ");
    }
    public void startengine(){
        System.out.println("Engine is started ....!!! vroom...vroom ");
    }
}
interface op{
    void fly ();
    default void nitro(){
        System.out.println(" The car is running now on the nitrooooooo.......");
    }
}
class Monstercar  extends Vehicle implements  op {
    public Monstercar(int speed , String name ){
        super(name ,speed);
    }
    public static void main(String [] args ){
        Monstercar obj =  new Monstercar (301,"TOYOTA SUPRAAA");
        obj.Run();

        obj.startengine();
       obj.nitro();
       obj.fly();

    }
    @Override
    public void fly(){
        System.out.println(" The car is flying now using the nitrooo");
    }
    @Override
    public void Run(){
       // super.Run();
        System.out.println("the car is start and running like a  rocket");
    }
    @Override
    public void startengine (){
        System.out.println("engine is started ");
       // super.startengine();
    }


}