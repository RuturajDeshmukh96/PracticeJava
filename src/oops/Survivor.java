package oops;

public class Survivor {
    String playerName ;
     int health ;
    public Survivor (String playerName,int health) {
        this.playerName = playerName;
        this.health = health;
    }
        public void heal () {
             System.out.println(" player is using bandage and healing  ");

        }
    }
interface CombatAction{
    void meleeattack();
    default void throwbomb (){
        System.out.println("Grenade thrown! BOOM! 💣");
    }
}
class zombie extends Survivor implements CombatAction{
int ammo ;
    public zombie (String playername , int health,int ammo ) {
        super(playername,health);
        this.ammo=ammo;
    }

    @Override

    public void heal () {
        System.out.println(" plyer is using the medikit for health boost..! ");

    }
    @Override
    public void meleeattack(){
        System.out.println("Swinging the Katana sword! Slash! ⚔️");
    }

    public void shoot (){
        if (health <=20) {
            System.out.println("Attack fire om enemy");
        }else {
            System.out.println("use medilit need to cover..");
        }
    }

    public void shoot(int bulletsToFire) {
      if (bulletsToFire <= ammo ){
          this.ammo = this.ammo - bulletsToFire;

      }else {
          System.out.println("Fired " +  bulletsToFire + " bullets! Remaining Ammo: " + this.ammo);
      }

    }

    public static void main(String [] args ) {

        zombie war = new zombie("Ruturaj " ,100,500);
        war.heal();
        war.meleeattack();
        war.throwbomb ();
        war.shoot ();
        war.shoot (15);
    }


    }

