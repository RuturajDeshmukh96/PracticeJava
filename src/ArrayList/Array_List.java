package ArrayList;
import java .util.ArrayList;
public class Array_List {
    public static void start() {
        System.out.println("The Arraylist begin ");
    }
}
class CricketTeam {
    public static void main(String[] args) {
        ArrayList<String> players = new ArrayList<>();
        Array_List.start();
        players.add("One");
        players.add("Two");
        players.add("Three");
        players.add("Four");
        players.add("Five");
        System.out.println(players);
        players.remove("Five");
        System.out.println(players.size());
         for (String p : players ){
             System.out.println(p);
         }
    }
}