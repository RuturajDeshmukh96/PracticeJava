package Practice;

import oops.Vehicle;

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

class Motorcycle extends  Vehicle1 {
    boolean hasSidecar ;
    public Motorcycle (String brand , double price , int year , boolean hasSidecar){
        super (brand , year , price );
        this. hasSidecar  = hasSidecar;


    }
    public void displayInfo() {
        System.out.println("The brand name of car is : " + brand + "/n The price of the car is : \n" + price + "the years are :\n "  + year + "Is this has sidecar" + hasSidecar);
    }

    public static void main(String[] args) {

        car c = new car("Hondaa Civic ", 2026,150000.d,4);
        Motorcycle m = new Motorcycle("Hondaa",200000.d,2025,true)

        System.out.println(c);
        System.out.println(m);

        c.displayInfo();
        m.displayInfo();

    }
}