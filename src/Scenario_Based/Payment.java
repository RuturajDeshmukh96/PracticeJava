package Scenario_Based;

public class Payment {

    public void Pay (String Co_Number){
        System.out.println("The payment is done using the " + Co_Number);


    }

    public void Pay (long Upi_id){
        System.out.println("the payment is done using the upi id " + Upi_id);

    }

    public void  Pay (String Acc_No ,String IFSC_Code){
        System.out.println("thiss Payment is done using the ACC no and the IFSC code "+ Acc_No +  "  " + IFSC_Code);
    }
}
class Payment_Done {

    public static void main (String [] raj){

        System.out.println("The Payment is Done Successfully using follwing methods");

        Payment pay = new Payment ();

        pay.Pay("8998774466");

        pay.Pay(8989898989L);
        pay.Pay("99655669","5896482");
    }
}