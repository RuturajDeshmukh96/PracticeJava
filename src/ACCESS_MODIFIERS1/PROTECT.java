package ACCESS_MODIFIERS1;

public class PROTECT {
    protected String name = "Ruturaj" ;


}
class second {
    public static void main (String [ ] arg ){
   PROTECT p = new PROTECT();
   System.out.println(p.name );
}
}