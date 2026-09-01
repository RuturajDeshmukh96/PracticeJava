package DSA;
import java.util.Scanner;
public class _If {

    static void main() {
        Scanner  sc = new Scanner(System.in);
        System.out.println("1st number a");
        int a = sc.nextInt();
        System.out.println("2nd number b");
        int b = sc.nextInt();
        System.out.println("3rd number c");
        int c = sc.nextInt();
        ;
        if (a > b ){
            System.out.println("a is great ");
        }else if (b > c ){
            System.out.println("b is great ");
        }else if (c > a ){
            System.out.println("c is great ");
        }
    }
}
