package cyberSucess_javaTraining;


public class stat {
	String name = "Ruturaj";
	int age = 19  ;
	static String school = "sveri";
	
	
	
	stat (String name , int age ){
		this.name = name ;
		this.age = age ;
	}
	
	
	
	public void show () {
		System.out.println(name + "----"+ age + "---------------"+school  );
	}
	
	
	
	public static void main(String[] args) {
		stat s1 = new stat ("Ruturaj",23);
		stat s2 = new stat ("rutu",21);
		
	s1.show();
	
	
	s2.show();
	}
}
