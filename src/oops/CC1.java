package oops;

public class CC1 {
    private String model;
    private String engiene ;
    private String  colour ;
    public CC1 (String model , String engine , String  colour   ){
        this.model = model ;
        this.engiene = engine;
        this.colour=  colour;
    }
    public  CC1 (CC1 Newones ){
        this.model = Newones .model ;
                this.engiene= Newones .engiene ;
                        this.colour= Newones.colour ;
        }
        public  void show (){
        System.out.println ( "model no is : " + model + " the engine is : " + engiene + " colour  is a : "+ colour);
        }
        public void chage (){
        colour = colour = " Black  " ;
        }
    }
class Run01 {
    public  static void main(String [] args ){
        CC1 r1  = new  CC1("Supraa","turbo v6 ","Red");
        CC1 r2 = new CC1  (r1);
        System.out.println("start ");
       // r1.show();
        r2.show();
        System.out.println("change");
        r1.chage();
        r1.show();
        System.out.println("Final");
        r1.show();
       // r2.show();
    }
}