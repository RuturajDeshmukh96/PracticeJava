package Practice;

public class Cricket {
    
    public static void main(String[]args){

        rohit();
        Cricket p1 = new Cricket();
        p1.virat();
        dhoni();
        
    }
    public static void rohit(){
        
        System.out.println("Rohits static method with void return type");
    }
    public void virat(){

        System.out.println("Virats non-static method with void return type");
    }
    static int dhoni(){

        System.out.println("Dhoni static method with int return type");
        int i = 0;
        return i;
        
    }
}
