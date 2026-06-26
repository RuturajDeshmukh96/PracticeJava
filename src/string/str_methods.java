package string;

public class str_methods {
    public static void main  (String [] args ){

        String name = "RUTURAJ DESHMUKH    ";
        String word = "   Sveri's collage of engineering pandharpur";

        int a = name.length();

        String value = name.toLowerCase();

        String  b  =  word.toUpperCase();

        System.out.println(name);

        System.out.println(value);

        System.out.println(b);

        System.out.println(word.trim());

        System.out.println(a);

        System.out.println(name.substring(8));
        System.out.println(word.substring(3,18));
        System.out.println(name.replace('J','V'));
    }
}