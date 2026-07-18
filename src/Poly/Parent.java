package Poly;

class Parent1 {

    public void showmessage(){
        System.out.println("this the old process");
    }
}
  class child1 extends Parent1 {

  @Override
      public void showmessage(){
     System.out.println("the old methid is updated by the new chid ");

 }
public static void main(String [] raj2){

     child1 myobj = new child1 ();

     myobj.showmessage();
}
  }