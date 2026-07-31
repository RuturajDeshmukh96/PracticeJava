package VarArgs;

public class VARARGS {
    public static void Runs (int...score  ) {

        System.out.println("checking the runs ");

        int total = 0;
        for (int p : score) {
            total = total + p;

        }
        System.out.println(total);
    }
        public static void  main(String [] args ){

        Runs(22,33);





    }
}
