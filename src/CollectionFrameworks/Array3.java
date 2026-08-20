package CollectionFrameworks;

import java.util.ArrayList;

public class Array3 {
    String name ;
    public Array3 (String name ){
        this.name = name ;
        System.out.println("This is Printing the Name ");
    }
}
class Done1 {
    public static void main (String [] args) {
        ArrayList<Array3> go = new ArrayList<>();

        Array3 a1 = new Array3("Ruturaj");
        Array3 a2 = new Array3("Rutu");
        Array3 a3 = new Array3("raj");
        Array3 a4 = new Array3("Rajendra");

        for (String  p : go){
            System.out.println(p);

        }

    }

}
