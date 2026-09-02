package DSA;

public class St1 {

    public static void main (String [] args ){
        int n = 5 ;
        // out loop
        for (int i = n ; i >= 0; i--){
            // inner loop
            for (int j = 0 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println("  ");
        }
    }
}
