package Stream;
import java.util.*;
import java.util.stream.Stream;
public class Second {
public static void main (String [] args ){


    List<Integer> line = Arrays.asList(22,11,33,44,66,77,884,33,44,5522,1111,1,11);
    System.out.println("Original List " + line);

    List<Integer> mystrem = line.stream().

            filter(x -> x % 2 ==0 ).

            map(x -> x*2).sorted().

            distinct().

            toList();

  System.out.println("Streamed List " + mystrem);
}



}
