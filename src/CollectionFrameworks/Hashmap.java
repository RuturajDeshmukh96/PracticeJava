package CollectionFrameworks;
import java.util.HashMap;
public class Hashmap {

    public static void main (String [] args ){
        HashMap<Integer,String > stud = new HashMap<>();
        stud.put(1,"aj");
        stud.put(2,"bj");
        stud.put(3,"cj");
        stud.put(4,"dj");
        stud.get(2);
        stud.remove(4);
        System.out.println("This  is the printing the stud hashmap \n" + stud );

    }
}
