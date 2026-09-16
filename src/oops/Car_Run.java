package oops;

class Car_Info {
        private String name;
        private String model;
        private String Engine;
        private int carid;

        Car_Info(String name, String model, String Engine, int carid) {
            this.name = name;
            this.Engine = Engine;
            this.model = model;
            this.carid = carid;
        }


        Car_Info(Car_Info n) {
            this.carid = n.carid;
            this.model = n.model;
            this.name = n.name;
            this.Engine = n.Engine;

        }
        void change ( ){
            this.carid = 9600;
            this.Engine="Tunnned v8";
            this.model = "M5";
            this.name = "German Babdi ";
        }

        void show() {
            System.out.println("\nName  : " + name + "\nEngine : " + Engine + "\nModel : " + model + "\nCar Id : " + carid);
        }
    }

 public class Car_Run {
        public static void main(String[] args) {
            Car_Info r = new Car_Info("Toyota", "Supraa", "V12", 00);
             Car_Info s =  new Car_Info(r);
            r.show();
            r.change();
            System.out.println("__________________________________________________\n__________________________________________________\n__________________________________________________\n");
            r.show();
        }
    }
