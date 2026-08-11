package inheritance;

public class Multy {
}
interface One {
    void main1 () ;
}
interface Two {
    void main1 () ;
}
class Three implements One , Two {
    @Override
    public void main1 (){
        System. out .println("this is printing the multiple inheritance");
    }
public static void main(String [] args ){
        Three o = new Three ();
        o.main1  ();
}
}