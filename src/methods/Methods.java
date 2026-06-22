package methods;

public class Methods{

    public static void main(String[]args){

  Methods ob1= new Methods();
       ob1. add(10,20);
       int addition = ob1.add(10,20);
       System.out.println(addition);

    }

    public int add(int a, int b){

        return a+b;
    }
}