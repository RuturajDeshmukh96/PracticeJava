package ClassObj;

public class Shop {
    int productId;
    String productName;
    float productPrize;
    int  quantity;

    public void printBill(){

        System.out.println("The product id = " + productId);
        System.out.println("The product name is = " + productName);
        System.out.println("The product prize = " + productPrize);
        System.out.println("The quantity is " + quantity);
    }
}
class Bill {
    public  static void main(String [] args ){
        Shop mart = new Shop ();

        mart.productName = "BrownBread";
        mart.productId = 101;
        mart.productPrize = 69.33f;
        mart.quantity = 10 ;

        mart.printBill();

    }
}