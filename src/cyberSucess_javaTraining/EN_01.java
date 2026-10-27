 package cyberSucess_javaTraining;

public class EN_01 {
 private int a ;
 private String b ;
 
 public void  seta (int a , String b ) {
	 this.a = a ;
	 this .b = b ;

 }
 public int geta() {
	return this.a ; 
 }
 public String getb() {
	 return this .b ; 
 }
 public static void main(String[] args) {
	EN_01 r = new EN_01();
       r.seta(10 , "Run");
  System.out.println(r.geta());
  System.out.println(r.getb());
  
}
}
