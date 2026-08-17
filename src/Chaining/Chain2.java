package Chaining;

 public class Chain2 {
     String name;
     int age;
     float score;
     public Chain2() {
         this("Ruturaj", 22, 89.00f);
         System.out.println("The Frist Constructor ");
     }
     public Chain2(String name, int age, float score) {
         this.name = name;
         this.age = age;
         this.score = score;
         System.out.println("Lets start Constuctor Chaining ");
         System.out.println("The Constructor Chaining is in Working \n" + "It takes name age & score from the default constructor  : " + name + " " + age + " "  + score );
     }
     public static void main(String[] srgs) {
         Chain2 w = new Chain2();
     }
 }


