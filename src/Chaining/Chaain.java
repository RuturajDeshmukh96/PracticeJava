package Chaining;

public class Chaain {
    String name ;
    int age ;
    float  score ;
    public Chaain (){
        this ("Ruturaj ",89.00f , 22);
        System.out.println("thiss is printing from the default constructor  : " );
    }

    public Chaain (String name, float  score , int age ){
        this . name = name ;
        this.score = score  ;
        this . age = age ;
        System.out.println("The name of Stud is " + name + "The score of stud " + score );
    }
    public static void main(String [] args ) {
        Chaain c= new  Chaain () ;




    }
    }

