package ClassObj;

import java.net.StandardSocketOptions;
import java.sql.SQLOutput;

public class Employee {
    int id ;
    String name ;
    float salary ;

    public void employeedata(){
        System.out.println("The name of the employee1 is : " + name );
        System.out.println("The working id of this emp1 is : "+ id);
        System.out.println("The salary of this emp1 is : " + salary);
        System.out.println("Now the emp no. 2 ------------");
    }
    public void empdata (){
        System.out.println("The name of emp2 is : "+ name);
        System.out.println("The working id of this emp2 is : "+ id);
        System.out.println("The salary of this emp2 is : " + salary);
    }

}
class EmployeeData{
    public static void main (String [] args ){
        Employee akash = new Employee();
        Employee rushi = new Employee();
        rushi.name="Rushikesh";
        rushi.id= 22;
        rushi.salary = 50000.0f;
        akash.name = "Akash";
        akash.id = 10;
        akash.salary = 49000.0f;
        akash.employeedata();
        rushi.empdata();

    }
}
