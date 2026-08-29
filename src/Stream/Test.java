package Stream;
import java.util.*;
import java .util.stream.Stream;
public class Test {
    static void main() {


        List<Integer> done = Arrays.asList(11, 22, 11, 1212, 121, 1, 22, 55, 84, 5, 5, 516, 156, 456, 4866, 55, 15, 511, 11, 54);
        List<Integer> my = done.stream().filter(x -> x % 2 == 0).map(x -> x * 2).distinct().sorted().toList();

        System.out.println(my);
    }

}