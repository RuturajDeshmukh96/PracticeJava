package Poly;

public class Overloading {

    public  String run(int a, String thor ){
        System.out.println(a+ " " + thor );
        return thor ;
    }
    public void  run(float a , Boolean done){
        System.out.println(a+ " " + done);
       // return done. toString();
    }


    public static void main (String [] law){

        Overloading fu = new Overloading();

       fu. run(15,"iron");
       fu.run (400.00f,true);
    }// Final green dot test with correct email
}
