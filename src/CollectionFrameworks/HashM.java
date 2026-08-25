package CollectionFrameworks;
import java.util.HashMap;
public class HashM {
    public static void main (String[] args){
        HashMap<String,Integer > done =  new HashMap<>();

        done.put("Ruturaj",1);

        done.put("aj",2);

        done.put("dj",3);

        done.put("vj",3);


        for (String d : done.keySet()){
            System.out.println(d);
        }


    }
}
