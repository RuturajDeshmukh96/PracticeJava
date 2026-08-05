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
        Fightership Xwing = new Fightership("X-Wing",500,25);
        Xwing.hyperDrive();
        Xwing.attack(4);
        Xwing.attack(20);

        cargoship go = new cargoship(100,"X-king");
        go.hyperDrive();

        System.out.println("Final Stats -> Fighter Energy: " + Xwing.energy + " | Cargo Energy: " + go.energy);

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
            missiles = missiles - count;
            System.out.println("Target locked! Fired " + count + " missiles! Remaining: " + missiles);
        }else {
            System.out.println("Warning: Not enough missiles! ❌");
        }
    }
}
class cargoship extends SpaceShip {
    int shieldHealth;
    public cargoship( int  energy  , String shipName ){
        super(shipName,energy);
        this.shieldHealth=shieldHealth;
    }
    @Override
    public void hyperDrive() {
        energy = energy - 5;
        System.out.println("Heavy Cargo jumping slowly... 🐢 Energy left: " + energy );
    }

}