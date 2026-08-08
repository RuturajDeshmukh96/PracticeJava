package Practice;

public class Encapul1 {
    private String name ;
    private int age ;
    public Encapul1 (String name){
        this.name = name ;
        this.age = 23 ;
    }
    public String setname (){
        return name ;
    }


    public String getname() {
        return name ;

    }

    public static void main( String [] args ) {

        Encapul1 p1 = new Encapul1("Ruturaj ");

        System.out.println(" this is the end :  " + p1.getname());

    }

}
