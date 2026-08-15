package Chaining;

public class MethC {
  int marks ;  String name ;


    public  MethC done (String name ) {
     //   String name = "Rock ";
        System.out.println(name );
        return this ;
    }


    public MethC done1 (int marks ) {
       // int marks = 45 ;
        System.out.println(marks );
        return this ;
    }
    public MethC done2 (float percentage ){
        System.out.println("Third method chain - percentage : " + percentage );
        return this ;
    }
    public MethC done3 (boolean feepaid ){
        System.out.println("fees are paid " + feepaid );
        return this ;
    }

    public static void main(String [] args ){
        MethC c = new MethC ();
        c. done("Ruturaj").done1(89).done2(91.00f).done3(true);
    }
}
