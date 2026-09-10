package Practice;

public class Vehicle1 {

   protected String brand ;
    protected int  year;
    protected  double  price;

    public Vehicle1 (String  brand , int year , double price){
        this.brand = brand ;
        this.price = price ;
        this.year = year ;
    }

    public void displayInfo() {
        System.out.println("The brand name of car is : " + brand + "/n The price of the car is : \n" + price + "the years are : "  + year);
    }
}
class car extends Vehicle1 {
    int noOfDoor ;
    public car (String brand , int year , double price, int noOfDoor ){
        super(brand , year , price );
        this. noOfDoor = noOfDoor ;
    }

    public void displayInfo() {
        System.out.println("The brand name of car is : " + brand + "/n The price of the car is : \n" + price + "the years are :\n "  + year + "THe doors in car are : " + noOfDoor);
    }
}

class motorcycle