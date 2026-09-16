package oops;

public class Cont_Copy {
    String Devicename ;
    String Model ;
    int Modelno;
    float Prize ;

   public Cont_Copy (String Devicename , String Model , int Modelno , float Prize ){
       this.Devicename = Devicename ;
       this.Model = Model ;
       this.Modelno = Modelno ;
       this .Prize = Prize ;
   }
  public void show () {
      System.out.println("\nDevice name : " + Devicename + "\nModel : " + Model + "\nModel no : " + Modelno + "\nPrizee of Product : " + Prize);
  }
}
class Done {
    public static void main(String[] args) {


        Cont_Copy c1 = new Cont_Copy("Acer", "AL15", 12345, 65000f);
        c1.show();
    }
}