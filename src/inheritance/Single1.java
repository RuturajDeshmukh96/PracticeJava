package inheritance;

public class Single1 {
    public void One  (){
        System.out.println("the parent class");
    }
}
class Double1 extends Single1 {
    public void Two  () {
        System.out.println("this child class");
    }
    public static void main(String [] args ){
        Double1 p1 = new Double1();
        p1.Two();
        p1.One();
    }
}