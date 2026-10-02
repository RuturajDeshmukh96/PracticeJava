package cyberSucess_javaTraining;

public class Ex1 {
	static String one = "Ruturaj";
	int num = 21 ;
	
   void m1 () {
	   System.out.println(num+one);
   }
   
   
   static void m2 () {
	   Ex1 c1 = new Ex1 ();
	   
	   System.out.println(c1.num+one);
   }
   public static void main(String[] args) {
	Ex1 c = new Ex1 ();
	Ex1.m2();
	c.m1();
}
}
