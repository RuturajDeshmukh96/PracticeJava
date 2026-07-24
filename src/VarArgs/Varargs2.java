package VarArgs;

public class Varargs2 {

    static void Run(int... score ){
        System.out.println("this is the exapmle of the varargs ");

        int total = 0 ;
        for (int R : score ){
            total = total + R;
            System.out.println(score.length + total );
            System.out.println(total );
        }
    }
    public static void main (String [] ars){

        Run(33,11);
        Run (56,66,66,6655,42,2);
        Varargs2.Run(77,56,99,87);
        Run(78,5);
    }
}
