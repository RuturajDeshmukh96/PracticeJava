package ACCESS_MODIFIERS1;

public class ACCESS_MODIFIERS {

    private String carname;

    public void  setcarname(String name ) {
        this.carname = name;
    }
    public  String getCarname () {
        return carname;
    }

    public static void main(String [] arg ){
        ACCESS_MODIFIERS s = new ACCESS_MODIFIERS();
        s.setcarname("Supraaa");
        System.out.println(s.getCarname());
    }
}