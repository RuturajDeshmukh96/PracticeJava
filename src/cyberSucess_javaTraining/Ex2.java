package cyberSucess_javaTraining;

public class Ex2 {
	String studName ;
	int rollNo ;
	float marks ;
	
 public void displayStud () {
	 System.out.println(" || Studname :   " + studName + "  ||   Roll No : " + rollNo + " || Marks : " + marks  );
 }
 void calculate () {
	if (marks <= 90 ) {
		System.out.println("Grade A ");
	} else if (marks <=  75  ) {
	System.out.println("Grade B");
 } else if (marks <= 60 ) {
  System.out.println("Grade C ");
}else {
	System.out.println("Fail");
}
}
  public static void main (String [] args ) {
	  Ex2 e = new Ex2 ();
	  e.marks= 91f ;
	  e.rollNo= 15 ;
	  e.studName="Rutu";
	  e.displayStud();
	  e.calculate ();
}
}
