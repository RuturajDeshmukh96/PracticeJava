package Static_Instance_Blocks;

public class FreeFire {
    static{
        System.out.println("The game is Downloaded");
    }
    {
        System.out.println("Firing");
    }
    public FreeFire(String Gun){
        System.out.println("Lets Fire "+ Gun);
    }

    public static void main(String [] args ) {
        System.out.println("this is the free fire");

        FreeFire f1 = new FreeFire("MP40");
        FreeFire f2 = new FreeFire("SCAR");
        FreeFire f3 = new FreeFire("M4A1");
        FreeFire f4 = new FreeFire("AK-47");

    }
}
