package Scenario_Based;

 class Message {

    public void SMSapp(){
        System.out.println("The meessage is send using SMS message ");
    }
}
class Mes extends Message {
    @Override

    public void SMSapp() {
        System.out.println("The message is send using Whatsapp");


    }
}

class Main {
    public static void main(String[] Raje) {

        Message obj = new Mes();

        obj.SMSapp();
    }
}