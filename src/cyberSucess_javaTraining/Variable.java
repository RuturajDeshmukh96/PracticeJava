package cyberSucess_javaTraining;

public class Variable {
	
	int x;
	
	int a = 10 ; // instance variable called anywhere like in instance method but not in the static method 
	// for calling the instance variable int the static method we need to create an object o that class 
	// like as shown in static one method 
	// for assigning the value to the instance variable we need to create an object always 
	// java gives deafult 0 value to the instance variable if we not written or assign 
	
	
	public static  void one () {
		Variable v1 = new Variable ();
		
		int b = 20 ;
		System.out.println(v1.a+b);
	}
	
	
	
	public  void two () {
		int c = 30 ;
		System.out.println(a+c );
		System.out.println(x);
	}
	
	
	
public static void main (String [] args ) {
	Variable v = new Variable ();
	
	
	v.two();
	Variable .one();
}

}
