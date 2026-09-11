package Practice;

public class BankAccount {

   private  String accountHolder ;
    private String accontNumber ;
    private double balance ;



    public BankAccount (String accontNumber , String accountHolder ){
        this.accontNumber =accontNumber ;
        this. accountHolder = accountHolder ;
        this.balance = 0.0d;
        System.out.println(accountHolder +  " ||| "+ accontNumber);
    }

    public String  getAccountNumber (){
        return accontNumber ;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance () {
        return balance ;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder ;
    }


public void deposit (double amount ){
        if (amount  <=  0 ){

            System.out.println("Invalid deposit Ammount  ");
        }else {
            balance = balance + amount ;
            System.out.println("Your Ammount is Succefully deposited  : " + balance );
    }

}
public void withdrawl (double amount ) {
        if (amount >= 0 && amount <= balance  ){
            balance = amount - balance ;
            System.out.println("successfullt withdrawl | Your balance is :  " + balance);
        }else if ( amount > balance ){
            System.out.println("You are entering the invalid ammount ");
        }else {
            System.out.println(" invalid !!! ");
        }
}
public static  void main (String[] args) {
        BankAccount b1 = new BankAccount("1212","Ganesh" ) ;

        b1.deposit(10000.0d);
        b1.withdrawl(100);
        b1.getBalance();
}
}
