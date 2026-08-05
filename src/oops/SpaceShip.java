package oops;

public class SpaceShip {
    String shipName;
    int energy = 100;
    public SpaceShip(String shipName ,int energy ){
       this.shipName = shipName  ;
       this.energy=energy;
       System.out.println("System Online: " + shipName);

    }
    public void hyperDrive(){
        energy = energy - 10;
    }
    public static void main(String [] args ){

    }
}
class Fightership extends SpaceShip {
    int missiles;

    public Fightership(String shipName, int energy, int missiles) {
        super(shipName, energy);
        this.missiles = missiles;
    }

    @Override
    public void hyperDrive() {
        energy = energy - 20;
        System.out.println("Fighter Jet Light-Speed Jump! ⚡ Energy left: " + energy);
    }

    public void attack(int count) {
        //int count = 25 ;
        if (missiles >= count) {
            System.out.println("Target locked! Fired " + count + " missiles! Remaining: " + missiles);
        }else {
            System.out.println("Warning: Not enough missiles! ❌");
        }
    }
}
