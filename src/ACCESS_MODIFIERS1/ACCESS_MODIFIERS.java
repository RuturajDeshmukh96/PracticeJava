package ACCESS_MODIFIERS1;

public class ACCESS_MODIFIERS {


    private String name ;
    public void car (String name ){
        //this. name = "Supraaaaaaaa" ;
    }
    public void getname (){
        System.out.println("car name : " + name );
    }
    public void setname () {
        this.name = "supraa";
    }
    public static void  main (String [] args ){
        ACCESS_MODIFIERS a = new ACCESS_MODIFIERS();

        a.setname();
        a.getname();
    }
}
