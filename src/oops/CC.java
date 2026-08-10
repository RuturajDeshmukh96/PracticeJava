package oops;

public class CC {
    String name;
    int age  ;
    public  CC (String name , int age ){
        this.name = name ;
        this.age = age ;
    }
    public CC (CC New  ){
        this. name = New .name ;
        this. age = New .age ;
    }
    public void show (){
        System.out.println("  name - " + name + "  : age  " + age );
    }
    public void reduce (int reduceage){
        age =  age  - reduceage ;
    }

}
class Run4 {
    public static void  main (String []args ){
        CC r1 = new CC("Rutu",18);
        CC r2 =  new CC (r1);
        System.out.println("Start...");
        r1.show();
        r2.show();
        System.out.println(" reducing the age by -1  ");
        r1.reduce(1);
        System.out.println("final ");
        r1.show();
        r2.show();
    }

}