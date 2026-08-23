package Stream;
import NEXT_CHAPTER.Array;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;


public class Start {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Apple ", "banana", "Mango");
        Stream<String> mystream = list.stream();

        String[] array = {"Apple ", "banana", "Mango"};

        Stream<String> myar = Arrays.stream(array);
    }
}
//    List<String> lst = Arrays.asList("dfg", "lkd", "lskds");
//
//    Stream<String> myStream = lst.stream();
//
//
//    String[] array = {"ksjs", ";slk", "ldks"};
//
//
//    Stream<String> mystr = Arrays.stream(array);
//
//}
//

// using asList we can directly add elements int the arraylist which is fixed
// what i learn ?
// we need frist import the library of the stream = strame.Strame ;
// then create any list = List <String > lst = Array.asList ("jdi","jir","rgi");
// then create a strame of the list = Strame <String> mystream = lst.Stream();
// then for the array  = create array = String [] array = {"djj","djk","djkhj"};
//next create the array stream = Stream <String > ms =array.stream(arrray);