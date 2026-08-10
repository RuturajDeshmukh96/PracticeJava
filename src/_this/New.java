package _this;

public class New {
    public void gun (){
        System.out.println("thiss is frsit ");
    }
    public void newgun (String gun){
        this.gun();
        System.out.println("this is prinitng  using the this  keyword ");
    }
    public static  void main (String [] arg ){
     New p1 = new New() ;
     p1.newgun("Ak ");
    }
}
