package DSA;
import java.util.*;
public class A2D {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row number : ");
        int rows = sc.nextInt();
        System.out.println("enter the column number :");
        int col = sc.nextInt();
        System.out.println("enter elements in your defined matrix ");
        int Ar2 [] [] = new int[rows][col];

       for (int i = 0 ; i< rows ; i ++) {
           for (int j = 0; j < col; j++) {
               Ar2[i][j] = sc.nextInt();
           }
       }
           for (int i = 0 ; i < rows; i ++) { 
               for (int j = 0 ; j < col; j++ ){
                   System.out.print(Ar2 [i] [j] + " ");
               }
               System.out.println();
           }
       }

}
