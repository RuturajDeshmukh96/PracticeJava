package Practice;

class Watch{

    void hello1(){

        System.out.println("Hello");
    }
}
public class Overloding2 extends Watch{

//    @Override
//    public void hello(){
//
//        System.out.println("Overlosding method");
//    }


    public void hello(int b){
        int a = 1;
        System.out.println("Overlosding mrthod");
    }
    public static void main(String [] args ){
        Overloding2 o = new Overloding2();
        o.hello(2);
        o.hello1();
    }
}
