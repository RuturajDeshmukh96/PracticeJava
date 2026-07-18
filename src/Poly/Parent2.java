package Poly;

 class Parent2 {

     public void show1(){
         System.out.println("this is the parent class ");
     }

}

class doly extends Parent2 {
     @Override
  public void show1(){
     System.out.println("this is shows that overridding ");
  }

  public static void main (String [ ] raj ){
      doly obj = new doly();
      obj .show1 ();
  }
 }// overridding