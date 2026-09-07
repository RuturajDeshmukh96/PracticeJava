package oops;
import java.util.*;
public abstract  class Emply {
    private String Name ;
    private int Id;


    public Emply (String Name , int Id){
        this.Name = Name;
        this.Id = Id;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    public String  getName1 () {
          return  this.Name = Name  ;
    }
    public void setId (int Id){
       this.Id = Id ;
    }
    public int getId1 () {
        return this.Id = Id;
    }
    public abstract void calculatePay () ;
}


class FullTimeEmployee extends Emply {
 private double weeklySalary ;
 public FullTimeEmployee (String name , int Id, double weeklySalary) {
     super(name, Id);
     this.weeklySalary = weeklySalary;
 }
     @Override
      public double calculatePay(){
         return this.weeklySalary ;
         System.out.println("Done Poly...1");
     }

}

class PartTimeEmployee extends  Emply {
    private double hoursrate ;
    private int hourswork;
public PartTimeEmployee (String name , int Id ,double hoursrate , int hourswork) {
    super(name, Id);
    this.hoursrate = hoursrate;
    this.hourswork = hourswork;
}
   @Override
      public int  calculatePay(){
        System.out.println("Done Poly...");
       return this.hourswork * this.hourswork;
    }
}
