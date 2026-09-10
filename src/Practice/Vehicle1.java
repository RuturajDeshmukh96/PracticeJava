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
        System.out.println("The brand name of car is : " + brand + "\nThe price of the car is : " + price + " \nThe years are : "  + year);
    }
}
class Car extends Vehicle1 {
    int noOfDoor ;
    public Car (String brand , int year , double price, int noOfDoor ){
        super(brand , year , price );
        this. noOfDoor = noOfDoor ;
    }

    public void displayInfo() {
      //  System.out.println("The brand name of car is : " + brand + "\nThe price of the car is : " + price + " \nThe years are : "  + year + " \nThe doors in car are : " + noOfDoor);
       super.displayInfo();
        System.out.println("The doors in car are : " + noOfDoor);
    }
}

class Motorcycle extends  Vehicle1 {
    boolean hasSidecar ;
    public Motorcycle (String brand , int year , double price   , boolean hasSidecar){
        super (brand , year , price );
        this. hasSidecar  = hasSidecar;


    }
    public void displayInfo() {
       super.displayInfo();
     //   System.out.println("The brand name of car is : " + brand + "\nThe price of the Motorcycle  is : " + price + " \nThe years are : "  + year + " \nIs this has sidecar : " + hasSidecar);
        System.out.println(" Is this has sidecar : " + hasSidecar);
    }

    public static void main(String[] args) {
       Vehicle1 v = new Vehicle1("Supraaa",2014,586300000.d);
        Car c = new Car("Lamboo ", 2026,150000.d,4);
        Motorcycle m = new Motorcycle("Hondaa",2021,210000.d,true);

        // System.out.println(c);
       // System.out.println(m);
        System.out.println("\n");
        v.displayInfo();
        System.out.println("\n");
        c.displayInfo();
        System.out.println("\n");
        m.displayInfo();

    }
}