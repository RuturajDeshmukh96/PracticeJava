package Dynamic;
class Oldtv {
    public void old () {
        System.out.println("This is old tv  ");
    }
    public void on () {
        System.out.println("The old TV is on ");
    }
}
class Smartv extends Oldtv {
    public void smart () {
        System.out.println("The is smart tv ");
    }
    public void on () {
        System.out.println("The NEW TV is on ");
    }
}
public class TV {
    public static void main (String [] arg ){
        Oldtv o = new Smartv() ;
        o.on();
        o.old();
        ((Smartv) o ) .smart ();
        ((Oldtv ) o ). on ();
    //   Oldtv s = new Oldtv() ;


    }

}


