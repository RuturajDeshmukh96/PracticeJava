package Practice;

public class FInaal1 {
    final static int a = 10;
    final static int b = 20;


    final static void Done() {
        System.out.println("This is the End ");

    }

    final static void Add() {
        System.out.println(a + b);

    }

    private int age;
    private String name;

    public FInaal1(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public String getname() {
        return name;
    }

    public int getage() {
        return age;
    }


    public static void test() {
        try {
            final int c = 0;
            final int d = 10;
            System.out.println(d / c);
        } catch (Exception e) {
            System.out.println("Something is wrong in the code ");
        } finally {
            System.out.println("I dont care about fu***ng err I alwyas Run");
        }
    }
}


interface Chick {
    void chicks ();
    default void  chicks1 () {
        System.out.println("This is the interface");
    }
}

    class Dove extends FInaal1 implements Chick {
        public int score ;
        public Dove (String name , int age,int score  ) {
            super(name ,age);
            this.score = score ;

        }
        public static void main(String[] args) {
            Done();
            Add();
            test();
            Dove f1 = new Dove("Ruturaj", 22,96);
             f1.chicks();
             f1.chicks1();
            System.out.println("The Name is is : " +f1.getname());
         System.out.println("The Age is : " +f1.getage());
            System.out.println("The Score is : " + f1. score );
        }


        @Override
        public void chicks (){
            System.out.println("absstract overroddding ");

        }
    }
