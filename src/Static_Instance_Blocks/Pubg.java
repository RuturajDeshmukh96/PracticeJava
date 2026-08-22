package Static_Instance_Blocks;

public class Pubg {
    static {
       System.out.println("Static 1- The Game name is PUBG") ;
    }
    {
        System.out.println("instace 2- enemy is firing ");
    }
    public Pubg(String bulletfire){
        System.out.println("constrcutor 3 - the bullet is fired : " + bulletfire);
    }
    public static void main (String [] args ){
        System.out.println("main-method 4 - the game is start  ");



        Pubg p = new Pubg("with mp 40 ");
         Pubg p1 = new Pubg("with ak 47");
         Pubg p2 = new Pubg("with m4a1");



    }
}

// what i learn - the static method always run first in the code
// static runs only once
// instance is repeatly call when we call object
// we dont need any method or keyword to write the instance  block
// staic runs before the main method always
// instance runs before the constuctor always