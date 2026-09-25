package Scenario_Based;

public class Order {
int orderId ;
String productName ;
double totalPrize ;
String orderStatus ;

Order (int orderId , String productName , double totalPrize , String orderStatus){
    this . orderId = orderId ;
    this.productName = productName ;
    this. totalPrize = totalPrize ;
    this . orderStatus = orderStatus ;
}
public Order (Order old ) {
    this.productName = old.productName;
    this.totalPrize = old.totalPrize;
    this.orderStatus = "Pending ";
    this.orderId = 9999;
}
public void show () {

    System.out.println(productName+ totalPrize + orderStatus + orderId);
}
public static void main (String[] args){
    Order o  = new Order(1000,"TOFO",500.0d,"failes");
    System.out.println("old order");
    o.show();
    Order o1 = new Order( o);
    System.out.println("New order");
    o1.show();
}


}
