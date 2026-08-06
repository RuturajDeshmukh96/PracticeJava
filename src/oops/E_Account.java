package oops;

public class E_Account {

    public String getAccountholder() {
        return accountholder;
    }

    public int getGetaccountfolder() {
        return getaccountfolder;
    }

    public void setGetaccountfolder(int getaccountfolder) {
        this.getaccountfolder = getaccountfolder;
    }

    public void setAccountholder(String accountholder) {
        this.accountholder = accountholder;
    }

    private String accountholder;
    private int getaccountfolder;


}

class  Bills extends E_Account {

    public static void main (String [ ] args ){

        E_Account obj = new E_Account();
        obj.getAccountholder();
        obj.getGetaccountfolder();
        obj.setAccountholder("Ruturaj ");
        obj.setGetaccountfolder(5202563);

    }
}
