package Chaining;

public class ConstC1 {
    String name ;
    int age ;
    public ConstC1 ( ){
        this("rutu", 18);
    }
    public ConstC1 (String name ,int age) {
        this.name = name; // "Ruturaj\n";
        this.age = age ;
        System.out.println(name + age);
    }

    static void main() {
        ConstC1 c = new ConstC1();
    }

}
