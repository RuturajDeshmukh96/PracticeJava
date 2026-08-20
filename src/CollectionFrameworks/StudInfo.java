package CollectionFrameworks;
import java.util.ArrayList;
public class StudInfo {
    public void Run () {
        System.out.println("Lets Create Arraylist ");
    }
        public static void main (String [] args ) {
            ArrayList<String> info = new ArrayList<>();
            info.add("Ruturaj");
            info.add("Ganesh");
            info.add("Raj");
            info.add("Gnyaaa");
            info.remove(1);
            System.out.println(info.size());

            for( String data : info ){
            System.out.println(data);}
        }
    }

