package CollectionFrameworks;
import java.util.ArrayList;
public class Ak_47 {
    String name;
    public Ak_47 (String name ){
        this.name = name;
        System.out.println("Arrays");
    }
}
class Run {
    public static void main(String[] args) {

        ArrayList<Ak_47> go = new ArrayList<>();
        Ak_47 a = new Ak_47("rutu");
        Ak_47 a2 = new Ak_47("raj");

        go.add(a);
        go.add(a2);

        for (Ak_47 d  : go){
            System.out.println(d.name);
        }
    }
}