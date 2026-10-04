package Practice;

public class EX_01 {
    String name ;
    int age ;
    float marks ;
    EX_01 (String name , int age , float marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
        public void show () {

            System.out.println("|| Name : " + name + "|| Age : " + age + "|| Marks :" + marks);
    }
}
