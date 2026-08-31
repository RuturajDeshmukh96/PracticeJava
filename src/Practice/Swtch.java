package Practice;
import java .util.*;
public class Swtch {
    static void main() {
        Scanner sc  =  new Scanner(System.in);
        int but = sc .nextInt();
        switch (but){
            case 1 :
                System.out.println("one ");
                break;
            case 2 :
                System.out.println("two");
                break;
            case 3 :
                System.out.println("three");
                break;
            default:
                System.out.println("enter valid no : ");
        }
    }
}
