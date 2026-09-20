import java.util.*;
public class Fact_1 {
    public static int  Run(  ) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int fact = 1 ;


        for (int i  = n ; i >=1 ; i--){
            fact = fact * i ;
        }
        return fact;
    }

    public static void main(String[] args) {
        System.out.println(Run());
        Run();
    }
}
