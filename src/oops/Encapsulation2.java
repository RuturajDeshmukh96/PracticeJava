package oops;

public class Encapsulation2 {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name ;
    private int roll;


    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public Encapsulation2 (String name , int roll ) {
        this.name = name ;
        this.roll= roll;
        System.out.println("This is from constructor");
    }

    public static void main (String [] args ){
        Encapsulation2 p1 = new Encapsulation2 ("rutu0" +
                "", 78);
        System.out.println("Name is: " + p1.getName());
        System.out.println("Roll is: " + p1.getRoll());    }
}
