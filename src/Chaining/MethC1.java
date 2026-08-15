package Chaining ;

class Parent1{

    static void main() {

        Parent1 obj = new Child1();
    }
        void m1(){

            System.out.println("Paents meth");

        }


}

class Child1 extends Parent1{

    static void main() {
        Child1 obj1 = new Child1();
        obj1.m1();
    }
    @Override
    void m1(){
        super.m1();
        System.out.println("Childs meth");
    }

    void m2(){}
}

public class MethC1{}