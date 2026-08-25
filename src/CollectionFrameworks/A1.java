package CollectionFrameworks;
import java.sql.SQLOutput;
import java.util.ArrayList;
public class A1 {
    String name ;
    public A1 (String name ){
        this.name = name ;
    }
}
class A2 {
    public static void main(String[] args) {


        ArrayList<A1> Go = new ArrayList<>();
        A1 a = new A1("Rutu");
        A1 a2 = new A1("Raj");
        A1 a3 = new A1("RutuRaj");

        Go.add(a);
        Go.add(a2);
        Go.add(a3);
       // Go.add("Rohit");

        for (A1 d : Go) {
            System.out.println(d.name);
        }
    }
}