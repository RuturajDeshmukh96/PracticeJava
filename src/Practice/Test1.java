package Practice;
import java.util.*;

public class Test1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] marks = new int[5];

        System.out.println("Enter the 5 students percentage % :");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = scan.nextInt();
        }

        System.out.println("Stud who get great than 70 %:");
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > 70) {
                System.out.println(marks[i]);
            }
        }

        scan.close();
    }
}