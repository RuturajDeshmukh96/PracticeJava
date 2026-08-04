package oops;

public class Robot {
    String modelname;
    int batterylevel;
    public Robot(String modelname , int  batterylevel) {
        this.modelname=modelname;
        this.batterylevel=batterylevel;
        System.out.println("Robot " + modelname + " Booted up! Battery is : " + batterylevel);
    }

    public  boolean checkbattry() {
        if (batterylevel > 20) {
            return true;
        } else {
            return false;

        }
    }
}
interface CombactAI {
    String enemyname = "Aliens ";
    void lockTarget(String enemyname );
   default void selfheal(){
       System.out.println("System healing... Battery restored! 🔋");
   }
    }
    class Terminator extends Robot implements CombactAI {
        int missiles;

        public Terminator(String modelname, int batterylevel, int missiles) {
            super(modelname, batterylevel);
            this.missiles = missiles;
        }

        public static void main(String[] args) {

            Terminator robo = new Terminator("Jarvis ", 15, 50);
            robo.checkbattry();
            robo.selfheal();
            robo.lockTarget(enemyname);
            robo.attack();
            robo.attack(3);
            robo.attack(4);
        }

@Override

        public  void lockTarget(String enemyname){
    System.out.println("Target LOCKED on: " + enemyname  );
            }

            public void attack(){
                if (checkbattry()) {
                    System.out.println("Laser Attack Fired! ");
                } else {
                    System.out.println("Warning: Low Battery! Cannot attack! ⚠️");
                }
            }
        public void attack(int count) {
            if (this.missiles >= count) {
                this.missiles = this.missiles - count;
                System.out.println("Fired " + count + " missiles!  Remaining: " + this.missiles);
            } else {
                System.out.println("Error: Not enough missiles! (You only have " + this.missiles + ")");
            }
        }
            }






