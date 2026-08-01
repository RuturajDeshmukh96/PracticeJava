package ClassObj;

import java.net.StandardSocketOptions;
import java.sql.SQLOutput;

public class Employee {
    int id ;
    String name ;
    float salary ;

    public void employeedata(){
        System.out.println("The name of the employee is : " + name );
        System.out.println("The working id of this employee is : "+ id);
        System.out.println("The salary of this emp is : " + salary);
    }

}
class EmployeeData{
    public static void main (String [] args ){
        Employee akash = new Employee();
        akash.name = "Akash";
        akash.id = 10;
        akash.salary = 49000.0f;

        akash.employeedata();


    }
}
