package Scenario_Based;

class Overloading_demo {

    public void pay(String upi_id) {
        System.out.println("this is printing the upi id " + upi_id);

    }

    public void pay(long Mobilenumber) {
        System.out.println("Payment done through the " + Mobilenumber);
    }

    public void pay(String acc_no, String Ifsc_code) {
        System.out.println("Payment was done using the acc no and ifsc code " + acc_no +"  " +Ifsc_code);
    }
}
    class Gpay {
        public static void main(String[] raj) {

            Overloading_demo pay = new Overloading_demo ();
            pay.pay(46465645646464L);
            pay.pay("4848645454");
            pay.pay("45454545","454e6845468");


        }
    }

