package Practice;
import java.util.Scanner;
public class StudDetails {
    int id ;
    int age ;
    int roll;
    int marks ;
    float percentage;
    float fees;
    String collage_name;
    String  your_name ;
    String hostel_name ;
    boolean feepaid;
    String opinion ;
    public void printdetails(){
        System.out.println("this is printing the imp  details only");
        System.out.println("name " + your_name);
        System.out.println("collage name "+ collage_name);
        System.out.println("fees are paid or not "+feepaid);
    }
}
class Information{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        StudDetails Stud = new StudDetails();
        System.out.println("Enter stud opinion here ");
        Stud.opinion = scan.nextLine();
        Stud.id = 01;
        Stud.age = 22;
        Stud.roll = 33;
        Stud.marks= 99;
        Stud.percentage= 89.99f;
        Stud.fees = 54000;
        Stud.collage_name = "Sveri";
        Stud.your_name = "Ruturaj";
        Stud.hostel_name = "boys -> 2";
        Stud.feepaid = true ;
        System.out.println("The id of this stud is :  " +Stud.id);
        System.out.println("The age of this stud is :  "+Stud.age);
        System.out.println("The roll no of this stud is :  "+Stud.roll);
        System.out.println("The marks of this stud is :  "+Stud.marks);
        System.out.println("The percentage of this stud is :  "+Stud.percentage);
        System.out.println("The fees of this stud is :  "+Stud.fees);
        System.out.println("The collage name of this stud is :  "+Stud.collage_name);
        System.out.println("The your name of this stud is :  "+Stud.your_name);
        System.out.println("The fees are paid  of this stud is :  "+Stud.feepaid);
        System.out.println("The hostel_name of this stud is :  "+Stud.hostel_name);
        System.out.println("The student says :  "+Stud.opinion);

        Stud.printdetails();
        scan.close();
    }
}
