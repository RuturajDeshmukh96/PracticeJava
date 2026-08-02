package Constructor;

public class MainClass1 {
    int age ;
    int marks ;
    String name ;
    public MainClass1(int age, int marks , String name ){
        this.age=age;
        this.marks=marks ;
        this.name=name;
        System.out.println("this line is from contructor ");
        System.out.println(age + " " + marks + " " + name );
    }
    public void Over(){
        System.out.println("i am creating this for const overriding ");
    }
}
interface Magic2{
    default void run(){
        System.out.println("this line is from interface");
    }
    default void run1() {
        System.out.println("second method of interfaace");
    }
}

class Subclass1  extends MainClass1 implements Magic2 {

    public Subclass1(int age,int marks ,String name ){
        super(age,marks ,name );

    }
    public static void main(String []args){
        Subclass1 done  = new Subclass1 (21,89,"rutu") ;
    done.run();
    done.run1 ();
    done.Over();
    }
    @Override
    public void run(){
        System.out.println("printing method  oveerridding  ");
        Magic2.super.run();

    }
    @Override
    public void Over(){
        System.out.println("this is printing the const overridding ");
        super.Over();

    }
}