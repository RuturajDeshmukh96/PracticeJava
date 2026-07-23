package Practice;
class OverRide {

    public void Run (){
        System.out.println("this is printing the parent method ");
    }
}

class Son1 extends OverRide {
    @Override

    public void Run() {
        System.out.println("this is the son class which is  making the  changes in psrent  ");
    }
}

    class walk {
        public static void main(String[] raje) {

            Son1 p1 = new Son1 ();
                    p1.Run();

        }
    }
