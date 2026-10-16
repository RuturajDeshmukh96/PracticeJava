package DSA;
import scanexample.Sc;

import java.util.Scanner;
public class P2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Row numbers : ");
        int row = s.nextInt();
        System.out.println("Enter column numbers : ");
        int col = s.nextInt();
        System.out.println("Enter your array elements : ");
        int Array [][] = new int [row][col];


        for (int i = 0 ; i < row ;  i ++){
            for (int j = 0 ; j < col ; j ++){
                Array[i][j] = s.nextInt();
            }
        }
        for (int i = 0 ; i < col ; i++){
            for (int j =0 ; j< col; j++){
                System.out.println(Array[i][j] + " ");
            }
        }
    }
}
