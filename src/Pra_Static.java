public class Pra_Static {

    {
        System.out.println("This is instance method ");
    }

    static {
        System.out.println("This is static method ");
    }
}
class Done {
    static String name ;
    static int age ;
    public Done (String name , int age ){
        this.name=name ;
        this . age = age ;
        System.out.println(name + "  "+age  );
    }

    static void main(String [] srgd ) {
        Pra_Static p = new Pra_Static();
        Done d = new Done("Ruturaj", 14);
    }
}