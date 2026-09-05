package DSA;
import java.util.*;
public class Ary2 {
    String name;
    int age ;
    public Ary2 (String name , int age ){
        this.name = name ;
        this.age = age ;

    }
    public void show() {
        System.out.println(" | age :  " + age + " | name :  " +  name +"   |" );
    }
}
class Art{
    public static void main(String[] args) {
        HashMap<Integer,Ary2> Dove = new HashMap();
        Ary2 a1 = new Ary2("Ruturaj",21);
        Ary2 a2 = new Ary2("Raj",23);
        Ary2 a3 = new Ary2("Gnya",34);

        Dove.put(101,a1);
        Dove.put(102,a2);
        Dove.put(103,a3);


        for (Integer k : Dove.keySet()){
            System.out.println(k);
            Ary2 a = Dove.get(k);
            a.show();
        }


    }
}