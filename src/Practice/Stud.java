package Practice;
import java .util.*;
public class Stud {

    public static void main(String[] args) {
        System.out.println("Enter the students percentaage % :");
        int[] marks = {77, 66, 88, 70, 76, 78, 10, 79};

        System.out.println("  The Students who get greter than 70 % in the exam :");


        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > 70) {
                System.out.println(marks[i]);
            }
        }
    }
}
