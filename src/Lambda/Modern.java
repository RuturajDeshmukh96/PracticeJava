package Lambda;

interface Cal {
    int calculation (int a  , int b );
}

public class Modern{
public static void main (String [] args ){

    Cal  addition = (a ,b) ->  a+b;
    Cal Multiplication = (a,b) -> a *b ;

int x = 10 ;
int y = 20 ;

int  add = addition.calculation(x,y);
System.out.println(add);

int mul = Multiplication.calculation(x,y);
System.out.println(mul);

}
}
