package cyberSucess_javaTraining;

public class Crop {
String farmerName ;
String cropName ;
String weight;

public Crop(String farmerName, String cropName,String weight  ){
	this.farmerName= farmerName ;
	this.cropName = cropName;
	this.weight = weight ;
}
public static void main (String [] name) {
	Tomato T = new Tomato("Ruturaj : ", "tomato : ","500kg");
	T.detailsT();
	
	Wheat T1 = new Wheat ("Soham : ","Wheat : ","1000kg");
	T1.detailsW();
}
}
class Tomato extends Crop {
	public Tomato(String farmerName, String cropName,String weight){
	super(farmerName, cropName,weight );
	}
	public void detailsT ( ) {
		System.out.println(farmerName + cropName+ weight);
	}
}

class Wheat extends Crop {
	
	Wheat (String farmerName, String cropName,String weight){
	super(farmerName, cropName,weight );
	}
	
	public void detailsW ( ) {
	System.out.println(farmerName+cropName +weight );
	}
	
	}
}