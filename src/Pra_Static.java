public class Pra_Static {

    {
        System.out.println("This is instance method ");
    }

    static {
        System.out.println("This is static method ");
    }
}
class Done {
     String name ;
     int age ;
     static  int count = 0 ;
    public Done (String name , int age ){
        this.name=name ;
        this . age = age ;
        count++;
        System.out.println(name );

        System.out.println(age );
        //System.out.println(count);
    }

    static void main(String [] srgd ) {
        Pra_Static p = new Pra_Static();
        Done d = new Done("Ruturaj", 14);
        Done d2 = new Done("rut",23);
        System.out.println(Done.count);
    }
}