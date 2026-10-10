package Chaining;

public class Const4 {
    String name ;
    int marks ;
    Float score ;
    public Const4(){
        this ("Ruturaj_Deshmukh", 21 , 89.0f);

    }
    public Const4(String name , int age , float score ){
        this .name = name ;
        this . marks  = marks ;
        this. score = score ;
        System.out.println(" The stud name is : " + name + "||  The Stud age is : " + age + "||  The Stud score is : " + score);

    }

    public static void main(String[] args) {
        Const4 c = new Const4();
    }
}
