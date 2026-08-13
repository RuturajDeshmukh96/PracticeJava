package Practice;

public class Single {
    public void frist () {
        System.out.println(" this is the base clas ");
    }
}
class Done extends Single {
    public void Deo(){
    System.out.println(" the  child 1 ");
}
public static void main(String [] arsg ){
        Done p1 = new Done() ;
        p1.frist();
        p1.Deo();
}
}