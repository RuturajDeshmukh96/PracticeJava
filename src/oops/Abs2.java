package oops;

public abstract class Abs2{
    public Abs2 () {


    }
    public abstract void rutu();

}
class Call1 extends Abs2 {
    public static void main(String[] args) {
        Abs2 p1 = new Call1();
   p1.rutu();
    }
    @Override

    public void rutu() {
        System.out.println(" this is abstaction  ");
    }
}