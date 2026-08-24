package Stream;
import java.util.stream.Stream;
import java.util.List;
import java.util.Arrays;
public class Third {
    public static void main(String[] args){

        List<Integer> list = Arrays.asList(1,2,3,44,55,220,55,88,2,99,400,2,333,111);

        List<Integer> mystream = list.stream().
                filter(x -> x % 2 == 0).
                map(x -> x *2).
                sorted().distinct().
                toList();
        System.out.println(mystream);

    }
}
