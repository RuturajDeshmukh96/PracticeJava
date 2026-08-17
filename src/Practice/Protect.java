package Practice;
import ACCESS_MODIFIERS1.PROTECT ;
public class Protect extends PROTECT {
    public void  setName () {
        System.out.println(name);
    }
    public static void main (String [] args ) {
        Protect n = new Protect();
        n.setName();
    }
    }

