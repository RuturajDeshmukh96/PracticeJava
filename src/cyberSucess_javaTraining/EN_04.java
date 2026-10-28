package cyberSucess_javaTraining;
class EN_05{
	
private String carName ;
private String carSpeed;

public void setValues(String carName, String carSpeed) {
	this.carName =carName;
	this.carSpeed = carSpeed ;
	
}

public String setname() {
	return this.carName;
}

public String setspeed() {
	return this.carSpeed;
}
public void run() {
	System.out.println("This method is from base class");
}
}


public class EN_04 extends EN_05 {
public static void main (String [] args) {
	EN_05 R = new EN_05();
	
R.run();
R.setValues("Supraaaaa","220 hr/km");
System.out.println("This Is Printing The Name of the Car : "+R.setname());
System.out.println("This Is  Printing Top Speed of the Car : " + R.setspeed());
}
}
