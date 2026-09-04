package CollectionFrameworks;
import java.util.*;


public class Hats {
    String name ;
    int age ;
    float marks ;

    public Hats (String name , int age , float marks) {
        this.name = name ;
        this.age = age ;
        this.marks = marks ;
    }
    public void show () {
        System.out.println(" | The Name Is :- " + name + " | The Age Is :- " + age + " | The Marks are :- " + marks);
    }
}
class Dec {
    public static void main(String[] a) {
        HashMap<Integer, Hats> Stud = new HashMap();
        Hats h = new Hats("Ruturaj", 21, 89.0f);
        Hats h1 = new Hats("avinash", 21, 90.0f);
        Hats h3 = new Hats("Ganesh", 22, 91.9f);

        Stud.put(101, h);
        Stud.put(102, h1);
        Stud.put(103, h3);
        for (Integer i : Stud.keySet()) {
            System.out.println(i);

            Hats info = Stud.get(i);
            info.show();
        }
    }
}