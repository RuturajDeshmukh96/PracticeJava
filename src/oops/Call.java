package oops;
 abstract  class Abs1{
    public abstract void startEngine ();

    }
public class Call extends Abs1{
    public static void main (String [] args ){

        Abs1 obj = new Call();
obj.startEngine();

    }
    @Override
    public void startEngine (){

        System.out.println("laura ");

    }
}
