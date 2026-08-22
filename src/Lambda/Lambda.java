package Lambda;

interface Mod{
    int  calculation (int a, int b);
}
public class Lambda {
    public static void main (String [] args ){

        Mod addition = (a,b) -> (a+b);
        Mod multi =(a,b) -> (a*b);
        Mod sub = (a,b) ->(a-b);


        int x = 10;
        int y = 100;


        int  result  = addition.calculation(x,y);
        System.out.println(result);
          int  result1  = multi.calculation(x,y);
        System.out.println(result1);
          int  result2  = sub.calculation(x,y);
        System.out.println(result2);


    }
}
