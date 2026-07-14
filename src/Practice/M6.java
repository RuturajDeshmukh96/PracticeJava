package Practice;

public class M6 {

    public static void main (String [] args ) {

        M6 p1 = new M6();
        p1.mca();
        M6 p2 = new M6();
        p2.mba();
        M6 p3 = new M6();
        p3.done();


    }

        public void mca(){

        System.out.println("Non static method no.1");

    }
    public void mba(){

        System.out.println(" Non static method no.2");
    }

    public void done (){

        System.out.println("this is last non static");
    }
}
