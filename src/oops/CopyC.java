package oops;

public class CopyC {
    private String model ;
    private String engine ;
    private  String company ;
    public CopyC (String model , String engine  , String company ){
        this . model = model ;
        this . engine =  engine   ;
        this  . company =  company ;
    }
    public CopyC(CopyC New ){
        this.model = New.model;
        this.engine= New . engine ;
        this.company = New . company ;

    }
    public void show (){
        System.out.println("model of car is : " + model + "  engine is  : " +engine  + "  company  of the car is : " + company);
    }
    public void  change (){
        model= model = "verna ";
        engine = engine = " turboo " ;
         company = company  = "volkswagon ";
    }

}
class Root {
    public static void main (String [] args ){
        CopyC c =  new CopyC ("supraa","  turbo v6 ","Toyota");
        CopyC d = new CopyC(c);
        System.out.println("Start ");
        c.show();
        System.out.println("lets make changes  ");
        c.change();
        System.out.println("final  ");
        c.show();

    }
}