package cyberSucess_javaTraining;

public class Run1 {
	
	//package cyberSucess_javaTraining;

	//public class Run {
	String name ;
	int age ;
	Run1 (String name , int age ){
		this .age = age ;
		this.name = name ;
	}
	public void show () {
		System.out.println("Name :" + name + "Age :" + age  );
	} 
	}
	class Root5 extends Run1 {
		float marks ;
		Root5 (String name , int age ,float marks  ){
			super (name ,  age );
			this. marks = marks ;  
		}
		public static void main (String [] args  ) {
			
			Root5 r1 = new Root5 ("Ruturaj", 17,89.0f);
			r1.show();
			
		}
	}


