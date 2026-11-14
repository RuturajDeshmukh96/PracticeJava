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
	System.out.println(" Calculated Market Prices of crop is : ");
}


public static void main (String [] name) {
	Tomato T = new Tomato("Ruturaj : ", "tomato : ",500,50);
	T.detailsT();
	T.calMarketprice();
	
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
		System.out.println("Crop detailes : Farmer name = "+farmerName +"Crop name =   "+ cropName+"  Weight =  "+ weight+"  Market price =  " + price );
	}
	@Override
		public void calMarketprice() {
		System.out.println("Let's calculate the price of the tomato based on its weight : ");
		price = price * weight ;  
		System.out.println(price );
	}
}

class Wheat extends Crop {
	
	public Wheat (String farmerName, String cropName,int   weight , int price ){
		super(farmerName, cropName,weight,price );
	}
	public void detailsW ( ) {
		System.out.println("Crop detailes : Farmer name = "+farmerName +"Crop name =  "+ cropName+"  Weight = "+ weight+"   Market price = " + price);
	}
	@Override 
	public void calMarketprice () {
		System.out.println("Let's calculate the price of the Wheat based on its weight : ");
		price = price * weight ;
		System.out.println(price);
		
	}
	
	}
