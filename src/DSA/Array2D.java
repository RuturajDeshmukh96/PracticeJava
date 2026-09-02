    package DSA;
    import java.util.*;
    public class Array2D {
        static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
            System.out.println("enter rows number");
      int rows = sc.nextInt();
            System.out.println("enter column number");
      int colms = sc.nextInt();

      int TwoD [] [] = new int [rows] [colms];
         //row
            System.out.println("enter rows ele " + (rows* colms) + " enter colmn ele");
      for (int i = 0 ; i <rows;i++){
          //column
          for (int j = 0 ; j < colms;j++){
       TwoD [i] [j] = sc.nextInt();
          }

      }
      //output
            for (int i = 0 ; i <rows;i++) {
                for (int j = 0 ; j<colms;j++){
                    System.out.print(TwoD[i][j]+ " ");
                }
                System.out.println();
            }
        }
    }
