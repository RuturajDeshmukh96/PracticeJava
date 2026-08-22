package Static_Instance_Blocks;

public class Start {
    static {
        System.out.println("static block : The theatre is opened ");
        // static  block is here & it runs only once when object is created
    }
    {
        System.out.println("instance block : The show is on - the curtons are opened  ");
        // this is the instance block which dont need to create any method
        // it is run evrytime when object crating
    }
    public Start(String Moviename ){
        System.out.println("Constructor-1 : The movie is start : - " + Moviename);
    }
    public static void main (String [] args ) {

   System.out.println("MainMethod - The tickets booking is open ");
          Start  show1 = new  Start ("Pushpa");
          Start show2 = new Start ("kantara");
          Start show3 = new Start("don");

    }
}
