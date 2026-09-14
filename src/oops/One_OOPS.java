package oops;

public class One_OOPS {

    String Colour ;
    String Type ;
    int Count ;

    public void One () {
            System.out.println("Lets Write Something Using PEN ");
    }
    public void type () {
        System.out.println("Type = " + this.Type);
        System.out.println("Color = " + this.Colour);
        System.out.println("Count of pens = " + this.Count);
    }
}
class Two_OOPS {

    public static void main(String[] args) {
        One_OOPS pen = new One_OOPS() ;
        pen.Colour= "Red";
        pen.Type="Gel Pen";
        pen.Count= 2 ;

        pen.One();
        pen.type();

     // ------------------------------------------------
        System.out.println("------------------------------\n------------------------------");
        One_OOPS pen2 = new One_OOPS() ;
        pen2.Colour= "Black";
        pen2.Type="Ball Pen";
        pen2.Count= 5 ;

        pen2.One();
        pen2.type();
    }
}