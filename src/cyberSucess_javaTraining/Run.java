package cyberSucess_javaTraining;

class Root extends Run {
    float marks;
    
    Root(String name, int age, float marks) {
        super(name, age);
        this.marks = marks;
    }
}

public class Run {
    String name;
    int age;
    
    Run(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void show() {
        System.out.println("Name :" + name + " Age :" + age);
    }

    public static void main(String[] args) {
        Root r1 = new Root("Ruturaj", 17, 89.0f);
        r1.show();
    }
}