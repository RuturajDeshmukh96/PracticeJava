package DSA;
import java.util.Arrays;
import java.util.Scanner;
public class Array_2d {
    public static void main(String [ ] args ){
        Scanner s = new Scanner(System.in);
        int rows = s.nextInt();
        int col = s.nextInt();
        int Twod [] [] = new int [rows] [col] ;

        for (int i = 0 ; i < rows ; i ++ ){
            for (int j = 0 ; j < col; j ++){
                Twod [i] [ j] = s.nextInt();
            }
        }
        for (int i =0 ; i < rows ; i++){
            for (int j = 0 ; j< col; j++){
                System.out.print(Twod [i] [ j] + " ");
            }
            System.out.println();
        }
    }







}
