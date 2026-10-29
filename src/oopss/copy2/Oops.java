package oopss.copy2;

public class Oops {
	int newdeposit ;
	private double bankbalance ;
	public void setvalues () {
		bankbalance = 0 ;
		newdeposit = 100;
	}
	public void  addbalance (){
		// this.bankbalance = bankbalance ; 
		bankbalance  = bankbalance + newdeposit ;
		System.out.println(bankbalance);
	}
public static void main (String [ ] args ) {
	Oops r = new Oops (); 
r.setvalues ();
r.addbalance();
}
}
