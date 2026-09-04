package DSA;
import java.util.*;
public class Hush {
    String name ;
    int age ;
    public Hush(String name , int age ) {
        this.name = name ;
        this.age = age ;
    }
    public  void show () {
        System.out.println(" | - Name is :- " + name + " "+" | - Age is :- " +  age );
    }
}
class Hosh {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap <Integer,Hush> StudInfo = new HashMap<>();


        Hush a = new Hush("rutu",12);
         Hush a1 = new Hush("rutu1",22);
         Hush a2= new Hush("rutu2",42);
         Hush a3 = new Hush("rutu3",32);
         Hush a4 = new Hush("rutu4",52);
         Hush a5 = new Hush("rutu5",22);



         StudInfo.put(101,a);
          StudInfo.put(102,a1);
          StudInfo.put(103,a3);
          StudInfo.put(104,a4);
          StudInfo.put(105,a5);
          StudInfo.put(106,a2);


          for (Integer p : StudInfo.keySet() ) {
             System.out.println(p);

              Hush gat = StudInfo.get(p);
              gat.show();

          }

    }
}