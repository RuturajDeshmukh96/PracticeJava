package oops;

public class set1 {
    private String name ;
    private int score ;

    public set1(String name , int score) {
        this.name =name ;
        this.score = score  ;
        System.out.println("this is the example o the encapsulaton");
    }
  //  public void setdetails() {
        //name = "Ruturaj ";
        //score = 99;
   // }
    public  int getscore (){
        return score ;
    }
    public String getname (){
        return name ;
    }

public static void main (String [] args ){
        set1 info = new set1("rutu",0) ;


    System.out.println("the name is : "+info.getname());
    System.out.println("the score is : "+info.getscore());

//    info.setdetails();
//    System.out.println("the name is :-  "+info.getname());
//    System.out.println("the score is :-  "+info.getscore());
//}
}
}
