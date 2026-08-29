package VarArgs;

public class Argu {


    int runs;

    static void done(int... runs) {
        int total = 0;
        for (int d : runs) {
            total = total + d;
        }
        System.out.println(runs.length);
        System.out.println(total);
    }
    public static void main(String[] args) {
        //  New n = new New();
        done(12, 23, 21, 12, 32, 31);
        done(11, 22, 33, 44);
    }
}
