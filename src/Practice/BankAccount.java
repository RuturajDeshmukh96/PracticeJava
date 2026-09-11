package Practice;

public class BankAccount {

   private  String accountHolder ;
    private String accontNumber ;
    private double balance ;



    public BankAccount (String accontNumber , String accountHolder ){
        this.accontNumber =accontNumber ;
        this. accountHolder = accountHolder ;
        this.balance = 0.0d;
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

        if (amount  >=  0 ){
            System.out.println("Invalid deposit Ammount  ");
        }else {
            System.out.println("Your Ammount is Succefully deposited " + balance );
    }

}
public void withdrawl (double amount ) {
        if (amount >= 0 && amount <= balance  ){
            amount = balance - amount ;
            System.out.println("successfullt withdrawl " + balance);
        }else if ( amount > balance ){
            System.out.println("Invalid Ammount ");
        }else {
            System.out.println("you are entering the invalid ammount ");
        }
}
public static  void main (String[] args) {
        BankAccount b1 = new BankAccount("1212","Ganesh" ) ;

        b1.deposit(210000.0d);
        b1.withdrawl(11500);
        b1.getBalance();
}
}
