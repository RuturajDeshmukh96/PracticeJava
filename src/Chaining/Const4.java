package Chaining;

public class Const4 {
    String name ;
    int marks ;
    Float score ;
    public Const4(){
        this ("Ruturaj ", 21 , 89.0f);

    }
    public Const4(String name , int age , float score ){
        this .name = name ;
        this . marks  = marks ;
        this. score = score ;
        System.out.println(" * the name is : " + name + "  the age is : " + age + "  the  score is : " + score);

    }

    static void main() {
        Const4 c = new Const4();
    }
}
