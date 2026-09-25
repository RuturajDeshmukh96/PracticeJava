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

}



}
