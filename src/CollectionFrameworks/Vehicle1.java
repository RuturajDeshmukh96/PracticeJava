package CollectionFrameworks;
import oops.Vehicle;

import java.util.HashMap;
public class Vehicle1 {
    String  owner ;
    String model ;
    String validity ;
    public Vehicle1 (String owner  , String model , String validity) {
        this.owner = owner ;
        this.model =  model ;
        this.validity= validity ;

    }
    public  void show () {
        System.out.println("Owner details  : " + owner +" : "+ model +" : " + validity );
    }
}
class Rto {
    public static void main (String [] args) {
        HashMap<String, Vehicle1> info = new HashMap<>();
        Vehicle1 v1 = new Vehicle1("Ruturaj", "BMW", "valid");
        Vehicle1 v2 = new Vehicle1("Ruturaj", "lambo", "valid ");
        Vehicle1 v3 = new Vehicle1("Ruturaj", "ferari", "Invalid");
        Vehicle1 v4 = new Vehicle1("Ruturaj", "toyota", "Invalid");
        Vehicle1 v5 = new Vehicle1("Ruturaj", "RR", "vaid ");


        info.put("MH101", v1);
        info.put("MH102", v2);
        info.put("MH103", v3);
        info.put("MH104", v4);
        info.put("MH105", v5);

     for (String platenumber : info.keySet()) {
         Vehicle1 data = info.get(platenumber);
         System.out.println(platenumber);
         data.show();


     }

}
}