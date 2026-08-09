package oops;

public class Encpaul {
    private String AccountHolder;
    private int AccountId;


    public Encpaul(String AccountHolder, int AccountId) {
        this.AccountHolder = AccountHolder;
        this.AccountId = AccountId;
        System.out.println("Constructor for encapsulation");
    }


    public void setAccountHolder(String newName) {
        this.AccountHolder = newName;
    }

    public void setAccountId(int newId) {
        this.AccountId = newId;
    }


    public String getAccountHolder() {
        return AccountHolder;
    }

    public int getAccountId() {
        return AccountId;
    }

    public static void main(String[] args) {

        Encpaul E = new Encpaul("Ruturaj", 244390);

        System.out.println("Name:" + E.getAccountHolder());
        System.out.println("ID: "+ E.getAccountId());
    }
}