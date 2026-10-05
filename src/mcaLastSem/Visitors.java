package mcaLastSem;

public class Visitors {
static String visitorName ;
static int totalVisitor = 0 ;

Visitors (String visitorName , int totalVisitor ){
	this .totalVisitor = totalVisitor  ;
	this.visitorName = visitorName ;
}
public static void show () {
	System.out.println( "Visitor count :  " + totalVisitor + " | | Visitor name : "+visitorName);
}

public static void main(String[] args) {
	Visitors v = new Visitors  ("Ruturaj " , 1 );
   Visitors.show();
}
}
