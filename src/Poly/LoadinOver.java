package Poly;

class LoadinOver {

    public void pay(long  phonePay) {

        System.out.println("this customer paying the bill using the phonepay number " + phonePay);
    }
    public void pay(String TransactionId , String userName  ){
        System.out.println("the Transactionid of  customer is " + TransactionId  + " and the name of the user is " +  userName );

    }

    public void pay(int Amount ){
        System.out.println("the amount is payed by customer is " + Amount);

    }
//    public void pay(String userName){
//        System.out.println(" The customer name is "+ userName );
//    }
}
class Customer {
    public static void main (String [] raj ){

        LoadinOver pay = new LoadinOver ();

        pay.pay(9699561545L);
        pay.pay(150000);
       // pay.pay("Ruturaj Deshmukh");
        pay.pay("525654545454s","Ruturaj Deshmukh..!");
    }
}