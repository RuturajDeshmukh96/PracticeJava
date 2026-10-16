package DSA;
import java.util.Scanner ;
public class P1 {
    public static void main (String [] args ){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the Row number : ");
        int row = sc.nextInt();
        System.out.println("Enter the Column number : ");
        int col = sc.nextInt();
        System.out.println("Enter your elements in the Array : ");
         int Arr [] [] = new int[row][col] ;
        for (int i = 0 ; i< row ; i++){
            for (int  j = 0 ; j < col ; j++){
                Arr [i] [j] =  sc.nextInt();
            }
        }
      for (int i = 0 ; i < row ; i ++) {
          for (int j = 0 ;j  < col ; j++){
              System.out.println(Arr[i][j] + " ");
          }
      }

    }


}
