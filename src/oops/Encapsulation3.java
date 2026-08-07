package oops;

public class Encapsulation3 {
    public String getHolder() {
        return Holder;
    }

    public void setHolder(String holder) {
        Holder = holder;
    }

    private String Holder ;

    public int getAccount() {
        return Account;
    }

    public void setAccount(int account) {
        Account = account;
    }

    private int Account ;
    public Encapsulation3(String Holder , int Account ){

        this.Holder=Holder ;
        this.Account = Account ;
        System.out.println(" This line is from the Constructor ");

    }
    public static void main(String [] args ){
        Encapsulation3 p1 = new Encapsulation3("Ruturaj " , 9812);
        System.out.println("The account holder name " + p1.getHolder());
        System.out.println(" The Account no. is " + p1.Account);
    }
}
