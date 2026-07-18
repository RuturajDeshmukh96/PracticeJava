package Poly;

public class Parent {

    public void showmessage(){
        System.out.println("this the old process");
    }
}
  class child extends Parent {

  @Override
      public void showmessage(){
     System.out.println("the old methid is updated by the new chid ");

 }
public static void main(String [] raj2){

     child myobj = new child() ;

     myobj.showmessage();
}
  }