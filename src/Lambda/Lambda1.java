package Lambda;



interface Mdo {
    int calcy (int p, int q);
}
public class Lambda1 {
    public  static void main (String [] args){

        Mdo  addition = (p,q) -> (p+q);

        int b = 100;
        int c = 200;
        int r  = addition.calcy(b,c);
        System.out.println(r);


    }
}
