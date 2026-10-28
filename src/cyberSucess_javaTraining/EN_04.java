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
}

public class EN_04 {
public static void main (String [] args) {
	EN_05 R = new EN_05();
	
R.setValues("Supraaaaa","220 hr/km");
System.out.println("This Is Printing The Name of the Car : "+R.setname());
System.out.println("This Is  Printing Top Speed of the Car : " + R.setspeed());
}
}
