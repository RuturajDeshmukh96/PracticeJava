package CollectionFrameworks;
import java.util.ArrayList;
public class Amazon {
    public static void main(String[] args) {
        ArrayList<String> shopping = new ArrayList<>();
        shopping.add("ihone");
        shopping.add("redmi");
        shopping.add("samsung");
        shopping.add("nokia");
        shopping.remove("nokia");
        System.out.println(shopping.size());
        System.out.println("you ordered devices ");
        for (String a : shopping){
            System.out.println(a);
        }

    }
}