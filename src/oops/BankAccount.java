package oops;

abstract class BankAccount {
    int accno;
    String acchold;
    private float balance;

    public BankAccount(int accno, String acchold, float balance) {
        this.accno = accno;
        this.acchold = acchold;
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }

    public void deposit(float amount) {
        balance = balance + amount;
        System.out.println(amount + " Deposited. New Balance: " + balance);
    }

    public void withdraw(float amount) {
        balance = balance - amount;
        System.out.println(amount + " Withdrawn. Remaining Balance: " + balance);
    }

    public abstract void calculateInterest();
}

class SavingsAccount extends BankAccount {

    public SavingsAccount(int accno, String acchold, float balance) {
        super(accno, acchold, balance);
    }

    @Override
    public void withdraw(float amount) {
        if ((getBalance() - amount) < 500f) {
            System.out.println("Transaction Failed: Minimum balance of 500 must be maintained.");
        } else {
            super.withdraw(amount);
        }
    }

    @Override
    public void calculateInterest() {
        System.out.println("Savings Interest is 5%: " + (getBalance() * 0.05f));
    }
}

class CurrentAccount extends BankAccount {

    public CurrentAccount(int accno, String acchold, float balance) {
        super(accno, acchold, balance);
    }

    @Override
    public void withdraw(float amount) {
        if ((getBalance() - amount) < 0f) {
            System.out.println("Transaction Failed: Insufficient Funds.");
        } else {
            super.withdraw(amount);
        }
    }

    @Override
    public void calculateInterest() {
        System.out.println("Current Account has 0% interest.");
    }
}

class BankSystem {
    public static void main(String[] args) {
        SavingsAccount myAcc = new SavingsAccount(101, "Rahul", 2000f);

        myAcc.deposit(1000f);
        myAcc.withdraw(2600f);
        myAcc.withdraw(1000f);
        myAcc.calculateInterest();
    }
}