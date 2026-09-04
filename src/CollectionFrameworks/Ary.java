package CollectionFrameworks;
import java.util.*;

public class Ary {
    String name ;

    public Ary (String name ){
        this.name =name ;
    }
}

class Ary2 {
     public static void main(String[] args) {


    ArrayList<Ary> done = new ArrayList<>();
    Ary a = new Ary("Ruturaj");
    Ary b = new Ary("RajRutu");

    done.add(a);
    done.add(b);


      for (Ary p : done){
          System.out.println(p.name);
      }
}}