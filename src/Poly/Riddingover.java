package Poly;

class Riddingover {
    public void Rutu(){
        System.out.println("this is printing the parent class");
    }
}
class son extends Riddingover {
    @Override
    public void Rutu(){
        System.out.println("this is printing the child class which overrides the parent class");

    }
}
 class Final {
    public static void main (String [] raje ){

        son obj = new son ();
        obj.Rutu();
     }
 }