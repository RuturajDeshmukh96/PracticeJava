package VarArgs;

public class EXVARARGS {
    public static void Runs (int... score ){
        System.out.println("lets check the runs ");
        int total =0 ;
        for (int r : score ){
            total  = total = r ;
            System.out.println(total );
        }
    }
    public  static void main (String []  args){
        Runs(515,545);
    }
}
