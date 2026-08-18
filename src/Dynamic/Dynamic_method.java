package Dynamic;

import oops.SmartPhone;

class Phone {
    public void phone (){
        System.out.println("Good Morning... This is the phone  ");
    }
    public  void on () {
        System.out.println("Turning on Phonne ");
    }
}
class Smartphone extends Phone {

    public void smartPhone () {
        System.out.println("This is SmartPhone");
    }
    public  void on () {
        System.out.println("Turning on SmartPhonne ");
    }
}
public class Dynamic_method {
    public  static void main (String [] args ){
        Phone p1 = new Smartphone();
        p1.on();
        ((Smartphone) p1).smartPhone();
        p1.phone();
        Phone p2 = new  Phone ();
        p2.on();

    }
}
