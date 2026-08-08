package Scenario_Based;

public class Encapsulation5 {
    private String name ;
    private int age ;
    public Encapsulation5 (String name){
        this. name = name ;
                this  . age = 23 ;
    }
    public String setname (){
        return name ;
    }
    public String getname () {
        return name ;
    }
    public static void main (String [] args){
        Encapsulation5 p1 = new Encapsulation5 ("Ruturaj") ;
        System.out.println(p1.setname ());
        System.out.println(p1.getname());
    }
}
