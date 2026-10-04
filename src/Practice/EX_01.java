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
       if (marks < 35 ){

           System.out.println("Stud is Pass" );
       }
    }
 class EX_001 extends EX_01 {
        boolean pass ;
        EX_001 (String name , int  age , float marks ){
            super( name  , age , marks );
            this. pass = pass ;
        }
 }

}
