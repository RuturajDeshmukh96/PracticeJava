package _this;

public class New {

    static void main() {
        String original = "Nanu";


        original.toUpperCase();

        // It STILL prints "Nanu", not "NANU"!
        System.out.println("Original string: " + original);
        original = "NANO";
        System.out.println(original);
    }
    }

