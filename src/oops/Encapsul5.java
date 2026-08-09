package oops;

public abstract class Encapsul5 {
    private String name ;
    private int age ;
    public Encapsul5(String name ){
this. name = name ;
this . age = 22;
    }
    public String getname (){
        return name ;
    }
    public int  getage () {
    return age ;

    }
    public abstract void   run1();

}
class Run extends  Encapsul5 {
    public Run (String name ){
        super(name );
    }
public static void main (String [] args ){
    Encapsul5 p1 = new Run("Ruturaj ");
    System.out.println(p1.getage());
    System.out.println(p1.getname ());
}
@Override
    public void run1 () {
    System.out.println("this is the end ");
}
}