package DSA;
import java.util.*;
public class Array2D {
    static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int rows = sc.nextInt();
  int colms = sc.nextInt();

  int TwoD [] [] = new int [rows] [colms];
     //row
  for (int i = 0 ; i <rows;i++){
      //column
      for (int j = 0 ; j < colms;j++){
   TwoD [i] [j] = sc.nextInt();
      }

  }
  //output
        for (int i = 0 ; i <rows;i++) {
            for (int j = 0 ; j<colms;j++){
                System.out.println(TwoD[i][j]+ "");
            }
        }
    }
}
