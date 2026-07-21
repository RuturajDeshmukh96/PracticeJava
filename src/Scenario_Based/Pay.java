package Scenario_Based;

public class Pay {

    public void BillingPay(){
        System.out.println("the cash payment is done of rs. 20000");
    }
}
class Bill extends Pay {

    @Override

    public void BillingPay() {
        System.out.println("The online payment is done of rs 20000");
    }
}
    class Run {

    public static void main (String [] args ) {

        Bill obj = new Bill ();
        obj.BillingPay();
    }
    }


