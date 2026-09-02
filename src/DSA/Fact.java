package DSA;

public class Fact {
   // int n = 0 ;
    public static void factoral (int n ){
        int fact = 1 ;
        for (int i = n; i >= 1; i--){
            fact = fact * i ;

        }
        System.out.println(fact);
    }

    public static void main(String [] args ) {
        factoral(5);

    }
}
