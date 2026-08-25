package CollectionFrameworks;

//import java.sql.SQLOutput;
import java.util.TreeSet;

public class Tree1 {
int name ;
    public Tree1(int  name ){
        this.name = name ;
        System.out.println("This  is  the  end ");
    }
}
class Tree2 {
    public static void main (String [] main ) {

        TreeSet<Tree1> run = new TreeSet<>();
        Tree1 t1 = new Tree1(90);
        Tree1 t2 = new Tree1(11);
        Tree1 t3 = new Tree1(33);

        run.add(t1);
        run.add(t2);
        run.add(t3);
        //     run.add(t2);

            System.out.println(run);

// not working it need to comprable for running
    }
}