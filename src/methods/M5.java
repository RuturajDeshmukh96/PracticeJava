package methods;
import java.util.*;
public class M5 {

    public static void main(String[] args) {

//        boidata();
        M5 obj = new M5();
        obj.hi("Hello",69);
    }
        public static void boidata( ) {


            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Your Name Here:");
            String name = sc.nextLine();
            System.out.println("  ");
            System.out.println("Your Good Name Is  :--> ");
            System.out.println("  ");
            System.out.println(name);
        }
        public void hi(String greet,int money){

        System.out.println(greet+" "+money);
        }
    }

