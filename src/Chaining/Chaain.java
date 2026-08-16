package Chaining;

public class Chaain {
    String name ;
    int age ;
    float  score ;
    public Chaain (String name){
        System.out.println("thiss is printing the name : " + name  );
    }
    public Chaain (float  score ){

        System.out.println("thiss is printing the score  : " + score  );
    }
    public Chaain (int age ){
        System.out.println("printing the age : " + age );
    }
    public Chaain (String name, int score , int age  ){
        this . name = name ;
        this.score = score  ;
        this . age = age ;
    }
    public static void main(String [] args ) {
        Chaain c= new  Chaain ("Rutu..!") ;
        Chaain c1 = new Chaain (89.0f);
        Chaain c2  =  new Chaain (22);


    }
    }

