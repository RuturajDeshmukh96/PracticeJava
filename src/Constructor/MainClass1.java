package Constructor;

public class MainClass1 {
    int age ;
    int marks ;
    String name ;
    int grade;
    public MainClass1(int age, int marks , String name ,int grade ){
        this.age=age;
        this.marks=marks ;
        this.name=name;
        this.grade=grade;
        System.out.println("This line is from Constructor 1");
        System.out.println(age + " " + marks + " " + name + " " + grade );
    }
    public void Over(){
        System.out.println("I am creating this for const Overriding 2");
    }
    public void Showgrade(){
        System.out.println("printing the grade of studeents " + grade);
    }
}
interface Magic2{
    default void run(){
        System.out.println("This line is from Interface 3");
    }
    default void run1() {
        System.out.println("Second method of Interface 4");
    }
    default void run2(){
        System.out.println("third para in interface with third method " );
    }
}


class Subclass1  extends MainClass1 implements Magic2 {

    public Subclass1(int age,int marks ,String name , int grade ){
        super(age,marks ,name ,grade);

    }
    public static void main(String []args){

        System.out.println("--------this is line is from main method----------");


        Subclass1 done  = new Subclass1 (21,89,"Ruturaj 👻☠️",86) ;
    done.run();
    done.run1 ();
    done.Over();
    done.Showgrade();
    done.run2();
    }
    @Override
    public void run(){
        System.out.println("printing method  Oveerridding  5");
        Magic2.super.run();

    }
    @Override
    public void Over(){
        System.out.println("this is printing the const Overridding 6");
        super.Over();

    }
    @Override
    public void run2(){
        System.out.println("override in the interface 2nd time");
        Magic2.super.run2();
    }
    @Override
    public void Showgrade(){
        System.out.println("override in const  2nd time");
        super.Showgrade();
    }
}