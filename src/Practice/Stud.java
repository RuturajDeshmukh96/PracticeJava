package Practice;
import java .util.*;
public class Stud {

    public static void main(String[] args) {
        System.out.println("Enter the students percentaage % :");
        int[] marks = {77, 66, 88, 70, 76, 78, 10, 79};

        System.out.println(" Stud who get grat than 70 %:");


        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > 70) {
                System.out.println(marks[i]);
            }
        }
    }
}
