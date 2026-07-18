package Constructor;

public class _Over_loading {


//    public static int Rutu(int a , int b ){
//        System.out.println("1st parameter ans ");
//        return a * b ;
//    }
//
//    public static int Rutu(int a ,int b, int c){
//        System.out.println("2nd paramter ans ");
//        return a+b*c;
//
//    }
//    public static void main (String [] args ){
//        System.out.println(Rutu(22,56));
//        System.out.println(Rutu(11,100,50));
//    }
    public static int Rav(int a , int b ,int c ){
        System.out.println("This is printing 1st parameter ");
        return a*b-c;
    }
     public static String Raw(String e, String f , String g  ){
        System.out.println("This is printing 2nd parameter using String");
        return e+f+g;
     }
     public static void main (String [] raj){
        System.out.println(Rav(55,56,10));
        System.out.println(Raw("Ruturaj",  "Shahu",  "Deshmukh"));
     }


}// this is the overloading
