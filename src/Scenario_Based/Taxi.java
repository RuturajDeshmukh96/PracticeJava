package Scenario_Based;

public class Taxi {

    public void Oldtaxi () {

        System.out.println("The old taxi is pay based on meter reading ");

    }
}
class old extends Taxi {

    @Override

    public void Oldtaxi() {
        System.out.println("the uber taxi is pay based on the km ");

    }
}
class Ola {

    public static void main(String [] args ){

        Taxi obj = new Taxi ();
        obj.Oldtaxi();
    }
}