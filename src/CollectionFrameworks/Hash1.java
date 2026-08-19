package CollectionFrameworks;
import java.util.HashMap ;
public class Hash1 {

    String name ;
    int roll ;
    public  Hash1 (String name , int roll ) {
        this.name = name ;
        this.roll = roll ;
        System.out.println("The Name is : " + name + "The Age is : " + roll );
    }
}
class Hash2 {
    public static void main(String [] args ) {
        HashMap<Integer , Hash1> info = new HashMap<>();
        Hash1 h0 = new Hash1("Ruturaj", 1);
        Hash1 h1 = new Hash1("Rutu", 2);
        Hash1 h2 = new Hash1("Rajesh", 3);
        Hash1 h3 = new Hash1("Raju", 4);

        info.put(101, h0);
        info.put(102, h1);
        info.put(103, h2);
        info.put(104, h3);
        info.put(104,new Hash1 ("Ram ,",33));

        for (int  data : info.keySet()){

            System.out.println(data);



        }

    }

}