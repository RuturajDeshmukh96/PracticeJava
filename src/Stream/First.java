package Stream;
import NEXT_CHAPTER.Array;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;
//import java.util.Array;
public class First {

public static void main(String [ ] arg ) {

    List <Integer> one = Arrays.asList(1,22,3,44,55,22,11,33,11,88,33,90,90);
    List  <Integer> mystream = one.stream().
            filter(x-> x % 2 == 0).
            distinct().
            sorted().toList();
    System.out.println(mystream);
}
}
// what i learn ?
// to list  is used to collect the final  processed data into a new List.
// the distinct () function is used to the remove duplu from the list
// the sorted () is used to the sortt the list
// in the filter we prform opration using the lambda