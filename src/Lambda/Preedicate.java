package Lambda;
import java.util.function.Predicate;
public class Preedicate {
    public static void main(String [] args ) {
        Predicate<Integer> Check = marks -> marks >= 35;

        int sureshmarks = 51;
        int rammarks = 12;


        boolean rampass = Check .test(rammarks);
        System.out.println(rammarks);
        if ( rampass == true ){
            System.out.println("Ramesh is Pass");

        }else {
            System.out.println("Ramesh is fail");
        }


        boolean issureshpass = Check.test(sureshmarks);
        System.out.println(issureshpass);


        if (issureshpass == true) {
            System.out.println("Suresh Is Pass ");
        }else {
            System.out.println("Suresh Is Fail ");
        }

    }
}
