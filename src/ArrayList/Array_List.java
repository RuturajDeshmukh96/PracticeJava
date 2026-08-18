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
        players.add("One");
        players.add("Two");
        players.add("Three");
        players.add("Four");
        System.out.println(players);
    }
}