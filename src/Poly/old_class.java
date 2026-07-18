package Poly;

public class old_class {
    public void showparent() {
        System.out.println("this is parent properrty ");

    }
}
  class child extends old_class {
    public void showmessage (){
          System.out.println("this is the child parameter");

      }
      public static void main(String [] raj ){

        child obj = new child ();
        obj.showmessage();

      }
}
