package cyberSucess_javaTraining;

class En_03{
	public String empName ;
	private String empAccno;
	private int empBalance;
	
	public void setValues (String empName,String empAccno,int empBalance) {
		this.empName = empName ;
		this.empAccno =  empAccno;
		this.empBalance =empBalance;
	}
	public String getempName() {
		return this.empName;
	}
	public String getempAccno() {
		return this.empAccno;
	}
	public int getempBalance() {
		return this.empBalance;
	}
}
public class En_02{
	public static void main (String [] args) {
		En_03 r = new En_03() ;
		r.setValues("Ruturaj","001",50000);
		System.out.println(r.getempName());
		System.out.println(r.getempAccno());
		System.out.println(r.getempBalance());
		}
	}

