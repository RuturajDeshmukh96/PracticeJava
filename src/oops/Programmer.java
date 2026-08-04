package oops;

public class Programmer {
    String alisname ;
    String ipaddress;
    public Programmer(String alisname ,String ipaddress){
        this.alisname=alisname;
        this.ipaddress=ipaddress;
    }
    public void writeCode(){
        System.out.println("The codder is writting code in intellij");
        System.out.println("The name of hackeer is : " + alisname + "\nip addressof the hacker is : " + ipaddress);
    }
    public void scansystem(){
        System.out.println(" scanning local devices  ");

    }
}
interface SecurityTools {
    void byPass();

    default void hideIp() {
        System.out.println("Ip address is hide now--- you are a ghost now ");
    }
}
class EthicalHacker extends Programmer implements SecurityTools {
    int Bounty;


    public EthicalHacker(String alisname, String ipaddress, int Bounty) {
          super(alisname, ipaddress);
          this.Bounty=Bounty;
          System.out.println("The bounty is " + Bounty);
    }

    public static void main(String[] args) {

        EthicalHacker obj = new EthicalHacker("Rutu_pro", "121.878.121", 800);
        obj.writeCode();
        obj.hideIp();
        obj.byPass();

obj.scansystem(123321);
obj.scansystem("960361");

    }

    @Override
    public void writeCode() {
        System.out.println("The codder is writting the advanced code in intellij");
        super.writeCode();
    }

    @Override
    public void byPass() {
        System.out.println("The firewall is passed Succesfully ");
    }

    public void scansystem(String ownip) {
        System.out.println("scanningg for own-ip found & " + ownip);

    }

    public void scansystem(int targetip) {
        System.out.println("scanning for the  target-ip found % " + targetip);
    }
}

