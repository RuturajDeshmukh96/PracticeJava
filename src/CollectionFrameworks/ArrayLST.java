package CollectionFrameworks;

import java.util.ArrayList;

public class ArrayLST {
    String name ;
    public ArrayLST (String name ) {
        this.name = name ;
    }
    public static void main (String [] args ) {
        ArrayList<ArrayLST> Duck = new ArrayList<>();
        ArrayLST a = new ArrayLST("Soham");
        ArrayLST b = new ArrayLST("Rutu");
        ArrayLST c = new ArrayLST("Done ");

        Duck.add(a);
        Duck.add(b);
        Duck.add(c);

        for(ArrayLST P : Duck) {
            System.out.println(P.name);
        }
    }
}
