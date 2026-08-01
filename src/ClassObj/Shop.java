package ClassObj;
import java.util.Scanner;
public class Shop {
    int productId;
    String productName;
    float productPrize;
    int  quantity;
    String feedBack;
    int calculate;
    public void printBill(){

        System.out.println("The product id = " + productId);
        System.out.println("The product name is = " + productName);
        System.out.println("The product prize = " + productPrize);
        System.out.println("The quantity is " + quantity);
        System.out.println("The user feedback : " + feedBack);
        System.out.println("Your grand total is : " + (productPrize * quantity)  + "  \nThank You..!\nVisit Agin...😊");
    }
}
class Bill {
    public  static void main(String [] args ){
        Shop mart = new Shop ();
        Scanner Scan = new Scanner(System.in);
        System.out.println("Please enter  your feedback..! Have a good Day 🤩");
        mart.feedBack = Scan.nextLine();
        System.out.println("Here is your bill...");
        mart.productName = "BrownBread";
        mart.productId = 101;
        mart.productPrize = 69.33f;
        mart.quantity = 10 ;
        mart.printBill();
    }
}