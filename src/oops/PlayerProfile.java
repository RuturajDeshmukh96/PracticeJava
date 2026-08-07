    package oops;

    public class PlayerProfile {
        private String username;
        private int health1;

        public PlayerProfile(String username, int  health) {
            this.username = "Ruturaj " ;
            this.health1 = 100 ;
            System.out.println("New player name is " + username);
        }

        public String getusername (){
            return username;
        }
        public int  gethealth1 () {
         return health1;
        }
        public void takeDamage(int damage){
            health1 = health1 - damage ;
            if (health1 < 10 ){
                System.out.println("Plyaerr is dead..!");
            }else  {
                System.out.println(" player is still surviving ");
            }
        }
        public void heal(int potion){
            health1 = health1 + potion ;
            if ( health1 > 100 ){
                System.out.println(" The Playeer health is full..1");
            }else {
                System.out.println(" Medicine Nedded ");
            }
        }

        public static void main (String [] args ){
            PlayerProfile Gamer = new PlayerProfile("Ruturaj...",100);
           System.out.println("Starting health " + Gamer.gethealth1());
            Gamer.takeDamage(0);
            Gamer.heal(200);
            System.out.println("Final Health: " + Gamer.gethealth1());
        }
    }