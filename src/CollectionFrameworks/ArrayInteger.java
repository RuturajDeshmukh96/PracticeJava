package CollectionFrameworks;
import java.util.ArrayList ;
public class ArrayInteger {
    public static void main (String [] arg ){

        ArrayList<Integer> Score = new ArrayList <>();

     Score.add(12);
        Score.add(13);
        Score.add(15);
        Score.add(0);
        Score.remove(Integer.valueOf(0));
  System.out.println("The score are ");
  for (Integer s :Score ){
      System.out.println(s);
  }

    }
}
