package methods;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException ;

public class _OldInput {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your name: ");
        String name = reader.readLine();

        System.out.print("Enter your lucky number: ");
        String numberInput = reader.readLine();
        int number = Integer.parseInt(numberInput);

        System.out.println("Hello " + name + ", your number is " + number);
    }
}
