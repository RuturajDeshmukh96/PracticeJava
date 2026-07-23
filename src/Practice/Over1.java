package Practice;

class Over1
{
    static void  Run(int a ,int b ){
        System.out.println("this is printing the int values class");
        System.out.println(a +b );
    }
    static void Run(String fun){
        System.out.println("this is printing the strings");
    }
}
class Demmo {
    public static void main(String[] raj) {
        System.out.println("now this displays  the output");

        Over1.Run(2, 3);
        Over1.Run("Ruturaj");

    }
}