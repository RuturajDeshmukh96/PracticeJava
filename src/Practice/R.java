package Practice;

public class R {

   // public class LogScanner {
        public static void main(String[] args) {

            int[] serverLogs = {200, 200, 401, 200, 500}; // Notice I removed the 404!

            // 1. Set the flag to false before we start searching
            boolean found = false;

            for (int i = 0; i < serverLogs.length; i++) {
                if (serverLogs[i] == 404) {
                    System.out.println("Error 404 found!");
                    // 2. We found it! Flip the flag to true.
                    found = true;
                    break;
                }
                // Notice: The 'else' block is completely gone from here!
            }
           if (found == false) {
               System.out.println("404 is completely missing today! ");

            // YOUR TURN: Write an if statement right here, OUTSIDE the loop.
            // Check if 'found' is still false. If it is, print "404 is completely missing today!"

        }
    }
}
