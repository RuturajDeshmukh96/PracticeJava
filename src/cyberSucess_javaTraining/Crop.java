package cyberSucess_javaTraining;

public class Crop {
String farmerName ;
String cropName ;
int  weight;
int price  ;


public Crop(String farmerName, String cropName, int weight, int price    ){
	this.farmerName= farmerName ; 
	this.cropName = cropName;
	this.weight = weight ;
	this.price = price ;
}

public void calMarketprice() {
	System.out.println("This is method is used to Calculate Market Prices : ");
}


public static void main (String [] name) {
	Tomato T = new Tomato("Ruturaj : ", "tomato : ",500,50);
	T.detailsT();
	
	Wheat T1 = new Wheat ("Soham : ","Wheat : ",100,90);
	T1.detailsW();
	T1.calMarketprice();
	
}

}
class Tomato extends Crop {
	public Tomato(String farmerName, String cropName,int   weight , int price ){
	super(farmerName, cropName,weight,price );
	//this.price = price ;
	}
	public void detailsT ( ) {
		System.out.println(farmerName + cropName+ weight);
	}
	@Override
		public void calMarketprice() {
		System.out.println("Let's calculate the price of the tomato based on its weight : ");
		System.out.println(price = price * weight); 
	}
}

class Wheat extends Crop {
	
	public Wheat (String farmerName, String cropName,int   weight , int price ){
		super(farmerName, cropName,weight,price );
	}
	public void detailsW ( ) {
	System.out.println(farmerName+cropName +weight );
	}
	
	}
