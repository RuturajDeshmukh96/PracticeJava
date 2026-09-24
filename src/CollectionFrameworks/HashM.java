package CollectionFrameworks;
import java.util.HashMap;
public class HashM {
    public static void main (String[] args){
        HashMap<String,Integer > done =  new HashMap<>();

        done.put("Rutu",1);
       done .put("RD",5);
        done.put("aj",2);
        done.put("dj",3);

        done.put("rj",3);
       done.remove("aj",2);


        for (String d : done.keySet()){
            System.out.println(d);
        }


    }
}
