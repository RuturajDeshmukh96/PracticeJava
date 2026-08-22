package Lambda;
import java.util.function.Predicate;
public class Predicate1 {
    public static  void main (String [] arg ){
        Predicate<Integer>pass = marks -> marks >= 35 ;


        int sureshmarks = 40 ;

        boolean issureshpass = pass.test(sureshmarks);
        System.out.println(issureshpass);
    }
}
