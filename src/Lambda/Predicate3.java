package Lambda;
import java.util.function.Predicate;
public class Predicate3 {
    public static void main(String  [] arg ){
        Predicate<Integer> check = marks -> marks >= 35;
        int rammarks = 5;
        int shammarks = 50;


        boolean isrampass = check .test(rammarks);
        boolean isshampass = check.test(shammarks);

        System.out.println(isrampass);

        if (isrampass == true){
            System.out.println("Ram is Pass the Exam..!");
        }else{
            System.out.println("Ram is fail");
        }
        System.out.println(isshampass);
        if (isshampass == true ){
            System.out.println("Shaam is Pass the Exam..!");
        }else {
            System.out.println("Sham is failed the exam..");
        }
    }
}
