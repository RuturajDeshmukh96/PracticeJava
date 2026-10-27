 package cyberSucess_javaTraining;

public class EN_01 {
 private int a ;
 private String b ;
 
 public void  seta (int a , String b ) {
	  a = 10 ;
	 b = "Run";

 }
 public int geta(int a) {
	 
	 System.out.println("This is printing A " +a);
	 return a ; 
 }
 public String getb(String b) {
	 System.out.println("this is printing B"  + b );
	 return b ; 
 }
 public static void main(String[] args) {
	EN_01 r = new EN_01();
	r.seta(0, null);
	r.geta(0);
	r.getb(null);
}
}
