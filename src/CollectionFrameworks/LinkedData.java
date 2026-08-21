package CollectionFrameworks;
import java.util.LinkedList;
public class LinkedData {
    String  name ;
    public LinkedData (String name){
    this.name = name ;
    System.out.println("The Name is : " + name );
    }
}
class Link {
    public static void main(String[] args ) {
        LinkedList<LinkedData> L = new LinkedList <>();

        LinkedData d = new LinkedData("Rutu");
         LinkedData d1 = new LinkedData("Rutu1");
         LinkedData d2= new LinkedData("Rutu2");
         LinkedData d3 = new LinkedData("Rutu3");
         LinkedData d4 = new LinkedData("Rutu4");
        LinkedData  d10 = new LinkedData("Rutu10");
        //L.add(3,d10);
        L.add(d);
         L.add(d1);
         L.add(d2);
         L.add(d3);
         L.add(d4);
        L.add(3,d10);

        L.removeLast();
        L.addFirst(new LinkedData  ("Ram"));


        for (LinkedData l : L){
            System.out.println(l.name);
        }
    }
}