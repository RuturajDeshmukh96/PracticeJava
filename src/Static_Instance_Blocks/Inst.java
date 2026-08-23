package Static_Instance_Blocks;

public class Inst {
    {
        System.out.println("printing the instance block");
    }
    public static void main(String[] args ){
        Inst i = new Inst();
    }}
