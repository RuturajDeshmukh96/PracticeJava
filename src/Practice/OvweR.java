package Practice;

class OvweR {
    public void Run(){
        System.out.println("Thee parent class is here ");

    }
}
class Son extends OvweR {
     @Override
    public void Run(){
        System.out.println("the child class make changes in the parent class");
    }
}
class Final {
    public static void main (String [ ] args ){

        Son obj = new Son ();
        obj.Run();
    }
}

