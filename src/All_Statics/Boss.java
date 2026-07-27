package All_Statics;

public class Boss {

    static String  Run= "Ruturaj deshmukh";


    public static int Fast(int a , int b ){
        System.out.println("static method with the parameter "+(a+b));
        return a+b ;
    }



    public static void main(String [] raj){
        System.out.println("this is printing the static main method");

       System.out.println( Fast(22,60));
       int result = Fast(90,90);
       System.out.println(result);
    }
    static {
        System.out.println("this is printing the static block");
    }
}

