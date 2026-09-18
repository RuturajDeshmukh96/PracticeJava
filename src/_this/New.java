package _this;

public class New {

    static void main() {
        String original = "Nanu";

        // Let's try to change it by converting it to uppercase
        original.toUpperCase();

        // It STILL prints "Nanu", not "NANU"!
        System.out.println("Original string: " + original);
        original = "NANO";
        System.out.println(original);
    }
    }

