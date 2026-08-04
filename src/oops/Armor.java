package oops;
public class Armor {
    String suitename ;
    int powerlevel;

    public Armor (String suitename , int powerlevel){
        this.suitename=suitename;
        this.powerlevel=powerlevel;
        System.out.println("The constructor is created here..! ");
    }
public void fly(){
        System.out.println("Normal thrusters ON! Taking off...");

}
}
interface WeaponSystem {
    void fire();
    default void scantarget (){
        System.out.println("scanning area... enemy detected");
    }
}
class Hulkbuster  extends Armor implements WeaponSystem {
    int rockets;
    public Hulkbuster(String suitename , int powerlevel, int rockets) {
        super(suitename, powerlevel);
        this.rockets=rockets;
    }
        public static void main(String [] args ){

        Hulkbuster Avenger = new Hulkbuster("IronSuite",100,100);

        Avenger.fly();
        Avenger.fire();
        Avenger.scantarget();
        Avenger.attack();
        Avenger.attack(25);
        }
        @Override
       public void fly(){
        System.out.println("Heavy Thrusters Activated! Flying like a beast!!!");
        }
        @Override
        public void fire (){
        System.out.println("This is abstract method ");

        }

        public void attack (){
        if (powerlevel>20){
            System.out.println("Laser attack successful!");
        }else{
            System.out.println("System Error: Power too low for lasers! ");
        }
        }
        int count = 15 ;
        public void attack (int count){
        if (rockets >= count){
            System.out.println("The remaining rockets are : " + (count - rockets));
            return;


        }
        }

    }
