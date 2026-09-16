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
   Cont_Copy (Cont_Copy S){
       this.Devicename = S.Devicename ;
       this.Prize = S.Prize;
       this.Model = S.Model ;
       this.Modelno = S.Modelno ;

   }
  public void show () {
      System.out.println("\nDevice name : " + Devicename + "\nModel : " + Model + "\nModel no : " + Modelno + "\nPrizee of Product : " + Prize);
  }
  public void change () {
       this.Devicename = "MacBook";
       this.Model = "Air";
       this.Modelno = 1221;
       this.Prize = 2000000f;
  }
}
class Done {
    public static void main(String[] args) {


        Cont_Copy c1 = new Cont_Copy("Acer", "AL15", 12345, 65000f);
        Cont_Copy c2 = new Cont_Copy(c1);
        c1.show();
        c1.change();
        c1.show();
    }
}