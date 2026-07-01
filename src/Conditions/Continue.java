package Conditions;

public class Continue {
    public static void  main  (String [] args ) {
        for  (int a = 1 ; a<10 ; a++) {
            if (a==2 ){
                continue;
            }
            System.out.println("Lets go..!");
            System.out.println(a);
        }

    }
}
