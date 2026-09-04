package DSA;

import oops.Abs2;

import java.util.ArrayList;

public class Arry2_D {
    String name ;
    public Arry2_D(String name ){
        this.name = name ;

    }
}
class Run {
    public static void main (String [] args ){
        ArrayList<Arry2_D> Ro = new ArrayList<>();
        Arry2_D a = new Arry2_D("A");
        Arry2_D b = new Arry2_D("B");
        Arry2_D c = new Arry2_D("C");

        Ro.add(a);
        Ro.add(b);
        Ro.add(c);

        for (Arry2_D p : Ro ) {
            System.out.println(p.name);
        }
    }
}