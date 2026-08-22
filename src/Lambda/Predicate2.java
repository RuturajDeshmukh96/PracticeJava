package Lambda;
import java.util.function.Predicate;
public class Predicate2 {
    public static void main(String [] ags ){
        Predicate<Integer> CheckPass = marks -> marks > 35;
        int rammarks = 2;
        boolean isrampass = CheckPass.test(rammarks );
        System.out.println(isrampass);
    }
}
