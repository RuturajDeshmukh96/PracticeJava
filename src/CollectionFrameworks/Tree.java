package CollectionFrameworks;
import java.util.TreeSet;
public class Tree {
    int score  ;
    public Tree (int score ){
        this.score = score ;
    }
}
class No1 {
    public static void main (String [] arg ){
        TreeSet<Tree> data = new TreeSet<>();
        Tree t0 = new Tree(65);
        Tree t1= new Tree(25);
        Tree t2 = new Tree(42);
        Tree t3 = new Tree(99);
        Tree t4 = new Tree(19);

        data.add(t0);
        data.add(t1);
        data.add(t2);
        data.add(t3);
        data.add(t4);
       // data.add(t0);


      for ( Tree s : data) {
      System.out.println(s.score);
      }
    }
}