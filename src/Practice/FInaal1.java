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
    int age1 = 15 ;
    String name1 = "rock ";
    public  void loading (int age1 ){
        System.out.println(age1);

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
interface Duck {
    void duck ();
    default void duck1 () {
        System.out.println("This is interface 1");
    }
}

interface Chick {
    void chicks ();
    default void  chicks1 () {
        System.out.println("This is the interface 2");
    }
}

    class Dove extends FInaal1 implements Chick,Duck {
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
            f1.duck();
            f1.duck1 ();
          //  f1.loading ();
            System.out.println("The Name is is : " +f1.getname());
         System.out.println("The Age is : " +f1.getage());
            System.out.println("The Score is : " + f1. score );
        }


        @Override
        public void chicks (){
            System.out.println("absstract overroddding ");

        }
        @Override
        public void duck() {
            System.out.println("Thiss is  override from the interface 1  ");

        }
    }
